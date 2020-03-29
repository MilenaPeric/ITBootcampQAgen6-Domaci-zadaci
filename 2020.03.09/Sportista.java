package Domaci;

import java.util.Scanner;

public class Sportista {
	/*
	 * Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina
	 * rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. Sportistu
	 * ispisati u obliku: IME_PREZIME: godinaRodjenja
	 */
	private String ime;
	private String prezime;
	private double godRodj;

	public Sportista(String ime, String prezime, double godRodj) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
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

	public String toString() {
		return ime + "_" + prezime + ":" + godRodj;
	}

}
