package Domaci;
public class Sportista2 {
	/*
	 * Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina
	 * rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. Sportistu
	 * ispisati u obliku: IME_PREZIME: godinaRodjenja
	 */
	private String ime;
	private String prezime;
	private double godRodj;
	private Klub []klubovi;
	private int pozicija=0;

	public Sportista2(String ime, String prezime, double godRodj) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
		klubovi = new Klub[50];
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public double getGodRodj() {
		return godRodj;
	}

	public void dodajKlub(Klub k) {
		klubovi[pozicija] = k;
		pozicija++;
	}
	
	public String getListuKlubova() {
		String kluboviToString = "";
		for(int i=0; i<pozicija; i++) {
			kluboviToString += " " + klubovi[i].getNaziv();
		}
		return kluboviToString;
	}
	
	public String toString() {
		String listaKlubova = getListuKlubova(); 
		return ime + "_" + prezime + ":" + godRodj + listaKlubova;
	}

}


