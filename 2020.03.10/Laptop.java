package ucionica;

import java.util.ArrayList;

public class Laptop {
	/*
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri i da se smanji. Moze da se ispise u obliku
	 * (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */

	private ArrayList<Polaznik> polaznik;
	private String marka;

	public Laptop(String marka) {
		super();
		this.marka = marka;
		this.polaznik= new ArrayList<Polaznik>();

	}

	public String getMarka() {
		return marka;

	}

	public ArrayList<Polaznik> getPolaznik() {
		return polaznik;
	}

	public void dodajPolaznika(Polaznik p) {
		polaznik.add(p);
		polaznik.size();

	}

	public void ukloniPolaznika(Polaznik p) {
		polaznik.remove(p);
		polaznik.size();

	}
	
	public String vratiPolaznike() {
		String polaznici = "";
		for(int i=0; i<polaznik.size(); i++) {
			polaznici += " " + polaznik.get(i).ispis();
		}
		return polaznici;
	}
 
	public String ispis() {
		String polaznici = vratiPolaznike();
		return marka + "{" + polaznici + "}";
	}
}
