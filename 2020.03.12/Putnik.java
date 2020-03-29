package Domaci_1;

public class Putnik extends Covek {

/*Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
 * Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.*/

		
	public int novac;





	public Putnik(String ime, String prezime, int novac) {
	super(ime, prezime);
	this.novac = novac;
}


	public int getNovac() {
		return novac;
	}
	
	public void dodajNovac(int iznos) {
		novac = novac +iznos;
		System.out.println("Vas iznos je uspesno dodat i stanje " + getIme() + " sada iznosi:" + getNovac() );
	}
	
	public void oduzmiNovac(int iznos) {
		novac = novac - iznos;
		System.out.println("Iznos je uspesno skinut i stanje  " + getIme() + " sada iznosi :" + getNovac() );
	}
	

		
		
	}
	
	

