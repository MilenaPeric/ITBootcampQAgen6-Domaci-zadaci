import java.util.Scanner;

public class Sportista {

	/*
	 * Napisati klasu Sportista. Sportista ima 1) ime i prezime (polje tipa String)
	 * koje moze da se dohvati, ali ne i postavi 2) sport kojim se bavi (polje tipa
	 * String) koje moze da se dohvati ali ne i postavi 3) klub za koji igra (polje
	 * tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji
	 * igra. 4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje
	 * moze i da se dohvati i da se postavi.
	 * 
	 * Napisati glavni program koji kreira tri igraca. U glavnom programu
	 * iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
	 * Sportista.
	 * 
	 */
	private String ime;
	private String prezime;
	private String sport;
	private String klub;
	private int brojDresa;
	

	public Sportista(String imeIgraca,String prezimeIgraca,String sportIgraca, String klubIgraca, int brojDresaIgraca) {
		ime=imeIgraca;
		prezime=prezimeIgraca;
		sport=sportIgraca;
		klub=klubIgraca;
		brojDresa=brojDresaIgraca;
				
	}

	public String dohvatiIme() {
		return ime;
	}

	public String dohvatiPrezime() {
		return prezime;
	}

	public String dohvatiSport() {
		return sport;
	}

	public String dohvatiKlub() {
		return klub;
	}

	public void promeniKlub(String klubIgraca) {
		klub = klubIgraca;
	}

	public int dohvatiBrojDresa() {
		return brojDresa;
	}

	public void promeniBrojDresa(int brojDresaIgraca) {
		brojDresa = brojDresaIgraca;
	}

}
