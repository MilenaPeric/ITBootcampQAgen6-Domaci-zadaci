package Predstava;

public class Pozoriste {
	/*Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate.
	 *  Moze da se sastavi tekstualni opis u obliku naziv[id]. */

	
	private int id;
	private String naziv;
	private static int idGlobal = 1;

	public Pozoriste(String naziv,int idGlobal) {
		this.naziv = naziv;
		this.id = idGlobal;
		idGlobal++;
	}

	public static int getIdGlobal() {
		return idGlobal;
	}

	public String getNaziv() {
		return naziv;
	}


public String ispis1() {
	return naziv+"["+ id +"].";
}
	
}

