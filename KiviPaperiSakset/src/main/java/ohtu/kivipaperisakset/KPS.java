package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS {
	static final Scanner scanner = new Scanner(System.in);
	
	public static KPS luoKPSPelaajaVsPelaaja() {
		return new KPSPelaajaVsPelaaja();
	}
	
	public static KPS luoKPSTekoaly() {
		return new KPSTekoaly();
	}
	
	public static KPS luoKPSParempiTekoaly() {
		return new KPSParempiTekoaly();
	}
	
	public void pelaa() {
		Tuomari tuomari = new Tuomari();

        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();
        String tokanSiirto;

        tokanSiirto = annaToisenPelaajanSiirto();


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = annaToisenPelaajanSiirto();
            asetaSiirto(ekanSiirto);

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
	}
	
	private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
	
	protected abstract String annaToisenPelaajanSiirto();
	protected abstract void asetaSiirto(String siirto);
}
