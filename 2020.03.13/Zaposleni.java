package Predstava;

public class Zaposleni {
	/*
	 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
	 * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
	 * sastavi tekstualni opis u obliku ime[naziv_pozorista].
	 */

	private String ime;
	private Pozoriste pozoriste;

	public Zaposleni(String ime, Pozoriste pozoriste) {
		this.ime = ime;
		this.pozoriste = pozoriste;
	}

	public String getIme() {
		return ime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String ispis() {
		return ime+"["+ pozoriste + "].";
	}

	
	
}
