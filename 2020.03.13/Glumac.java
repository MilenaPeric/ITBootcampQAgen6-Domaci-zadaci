package Predstava;

public class Glumac extends Zaposleni {
	/* Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je
	 * uloga_ime[naziv_pozorista].*/

	private String uloga;

	public Glumac(String ime, Pozoriste pozoriste, String uloga) {
		super(ime, pozoriste);
		this.uloga = uloga;
	}

	@Override

	public String toString() {

		return uloga+"_" + "ispis";
	}

}
