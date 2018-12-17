package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPS {
	Tekoaly tekoaly;
	
	public KPSTekoaly() {
		 this.tekoaly = new Tekoaly();
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