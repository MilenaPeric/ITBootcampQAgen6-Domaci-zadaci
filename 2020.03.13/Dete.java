package Dete;

public class Dete {
	/*Dete ima ime, prezime, broj godina i broj klikera. 
	 * Napraviti mogucnost da se kreira vise objekata klase Dete.
	 *  Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
Napraviti metodu koja ce ispisivati broj klikera i
 metodu koja ispisuje prosecan broj decjih godina
 (ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo prosecne godine za to dvoje) .
*/
	
	private String ime;
	private String prezime;
	private int brGod;
	private int brKlikera;
	
	
	public static int brDece;		
	public static int ukpGod;
	
	
	public Dete(String ime, String prezime, int brGod) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGod = brGod;
		brDece++;
		ukpGod = ukpGod + brGod;
	}

	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getBrGod() {
		return  brGod;
	}
	public int getBrKlikera() {
		return brKlikera;
	}
	
	public void dodajBrKlikera(int br) {
		brKlikera = brKlikera + br;
	}
	
	public void oduzmiKlikere(int br) {
		brKlikera = brKlikera - br;
	}	
	
	
	public static double getPrGpod() {
		
		double prGod = ukpGod / brDece;
		return prGod;
	}
	
	
	
}

