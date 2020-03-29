package Domaci;

import java.util.Scanner;

public class Klub {
	/*
	 * Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa
	 * Sportista. Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	 * Napisati metodu koja ce ispisati ceo objekat klase klub.
	 */
	private String naziv;
	private String grad;
	private int godO;
	private Sportista[] sportisti;
	private int pozicija=0;
	
	public Klub(String naziv, String grad, int godO) {
		super();
		this.naziv = naziv;
		this.grad = grad;
		this.godO = godO;
		sportisti = new Sportista[50];
	}

	public void dodajSportistu(Sportista s) {
		sportisti[pozicija] = s;
		pozicija++;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrad() {
		return grad;
	}

	public double getGodO() {
		return godO;
	}

	public String getListuSportista() {
		String sportistiToString = "";
		for(int i=0; i<pozicija; i++) {
			sportistiToString += " " + sportisti[i].toString();
		}
		return sportistiToString;
	}

	public String toString() {
		String listaSportista = getListuSportista(); 
		return naziv + " " + grad + " " + godO + " " + listaSportista;
	}
}
