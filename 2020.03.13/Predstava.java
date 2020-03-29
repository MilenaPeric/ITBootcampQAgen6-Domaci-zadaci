package Predstava;

import java.util.ArrayList;

public class Predstava {
	/*
	 * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene
	 * koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju predstave
	 * mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
	 * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv
	 * pozorista u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene
	 * koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
	 */

	private String ime;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String ime, Pozoriste pozoriste) {
		this.ime = ime;
		this.pozoriste = pozoriste;
		this.zaposleni = new ArrayList<Zaposleni>();
	}

	public void addEmployees(Zaposleni zaposlen) {
		zaposleni.add(zaposlen);
	}

	public void removeEmpoloyee(Zaposleni zaposlen) {
		zaposleni.remove(zaposlen);
	}

	public int brZaposlenih() {
		return zaposleni.size();
	}

	public String ispis2() {
		int brZaposlenih =0;
	
		String ipsis2 = " ime + ,  + pozoriste.getNaziv()+ .  + \n";
		for (int i = 0; i < zaposleni.size(); i++) {
			zaposleni.get(i).getIme();
			brZaposlenih++;
			if (i != zaposleni.size() - 1) {
				System.out.println("\n");
			}
		}
		if (brZaposlenih == 0) {
			System.out.println("Nema zaposlenih na ovoj predstavi!");
		}
		return ispis2();
	}

}

