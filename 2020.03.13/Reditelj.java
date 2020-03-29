package Predstava;

public class Reditelj extends Zaposleni {
	/*
	 * Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik
	 * je nadimak_ime[naziv_pozorista].
	 */

	private String nadimak;

	public Reditelj(String ime, Pozoriste pozoriste, String nadimak) {
		super(ime, pozoriste);
		this.nadimak = nadimak;
	}
	
	public String getNadimak() {
		return nadimak;
	}

	public void setNadimak(String nadimak) {
		this.nadimak = nadimak;
	}


	@Override

	public String toString() {
		
		return nadimak+"_"+ "ispis";
	}
}
