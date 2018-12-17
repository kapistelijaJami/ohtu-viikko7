package ohtu.kivipaperisakset;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {
	TekoalyParannettu tekoaly;
	
	public KPSParempiTekoaly() {
		this.tekoaly = new TekoalyParannettu(20);
	}

	@Override
	protected String annaToisenPelaajanSiirto() {
		String tokanSiirto = tekoaly.annaSiirto();
		System.out.println("Tietokone valitsi: " + tokanSiirto);
		return tokanSiirto;
	}

	@Override
	protected void asetaSiirto(String siirto) {
		tekoaly.asetaSiirto(siirto);
	}
}
