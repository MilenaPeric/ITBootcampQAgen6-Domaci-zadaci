package Domaci_1;

import java.util.ArrayList;

public class Autobus{
	/*
	 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
	 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
	 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
	 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
	 * - Putnik1[novac], Putnik2 [novac],... )
	 */
	private String naziv;
	private Vozac vozac;
	private int cena;
	private int sedista;
	private ArrayList<Putnik> putnici;
	private boolean vozacJeUAutobusu;

	public Autobus(String naziv, Vozac vozac,int cena, int sedista) {
		this.naziv = naziv;
		this.cena = cena;
		this.sedista = sedista;
		this.vozac=vozac;
		putnici = new ArrayList<Putnik>();
	}

	public String getNaziv() {
		return naziv;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void postaviVozaca(Vozac vozac) {
		System.out.println("Novi Vozac je: " + vozac.getIme());
		this.vozac = vozac;
		vozacJeUAutobusu = true;
	}

	public void ukolniVozaca(Vozac vozac) {
		System.out.println(vozac.getIme() + " vise nije vozac");
		this.vozacJeUAutobusu = false;
	}

	public int getCena() {
		return cena;
	}

	public int getSedista() {
		return sedista;
	}

	public void dodajPutnika(Putnik putnik) {
		if (putnici.size() <= sedista) {
			putnici.add(putnik);
			System.out.println("Sediste u autobusu je dodeljeno: " + putnik.getIme());
		} else
			System.out.println("Sva sedista su popunjena.");
	}

	public void izbaciPutnika(Putnik putnik) {
		putnici.remove(putnik);
		System.out.println("Sediste u autobusu je oduzeto: " + putnik.getIme());
	}

	public void ispisiPutnike() {
		System.out.print("Lista putnika je: ");
		System.out.print("[ ");
		for (int i = 0; i < putnici.size(); i++) {
			Putnik p = putnici.get(i);
			System.out.print(p.getIme() + " ");
		}
		
		System.out.println("]" + " ,");
	}

	public void naplataKarte() {
		if (vozacJeUAutobusu == true) {
			System.out.print("Vozac je svim putnicima naplatio kartu : ");
			for (Putnik putnik : putnici) {
				putnik.oduzmiNovac(cena);
				System.out.println(putnik.getIme() + " ");
			}
		} else
			System.out.println("Vozac nije u autobusu");
	}


}
