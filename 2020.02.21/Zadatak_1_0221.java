package itbootcamp2;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije: 0 - Izlaz iz programa 1 - dodavanje cene
		 * proizvoda na racun (ubacivanje u potrosacku korpu) 2 - naplata racuna Ukoliko
		 * korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese opciju 1
		 * program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u
		 * prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika da unese
		 * kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost manju od
		 * vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da
		 * se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od
		 * cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se
		 * ponovo ispisuje meni.
		 */
		Scanner sc = new Scanner(System.in);
		int opcija;
		float racun = 0;
		float cena;
		float placanje;
		float kusur;
		do {
			System.out.println("Opcija 1: unos cene; Opcija 2: placanje; Opcija 0: program se zavrsava ");
			opcija = sc.nextInt();
			while (opcija < 0 || opcija > 2) {
				System.out.println("Pogresan unos, pokusajte ponovo");
				System.out.println("Opcija 1: unos cene; Opcija 2: placanje; Opcija 0: program se zavrsava ");
				opcija = sc.nextInt();
			}
			switch (opcija) {
			case 1:
				System.out.println("Molimo Vas unesite cenu proizvoda:");
				cena = sc.nextFloat();
				if (cena > 0)
					racun += cena;
				else
					System.out.println("Pogresan unos, molimo Vas pokusajte ponovo");
				break;
			case 2:
				if (racun <= 0) {
					System.out.println("Molimo Vas unesite cenu proizvoda");
					break;
				}
				else {
					System.out.println("Vas racun iznosi " + racun + ". Unesite iznos za placanje racuna:");
					placanje = sc.nextFloat();
					if (placanje >= racun) {
						kusur = placanje - racun;
						System.out.println("Vas kusur iznosi " + kusur + ".");
						racun = 0;
						placanje = 0;
						kusur = 0;
						break;
					}
					else
						System.out.println("Uneli ste iznos koji je manji od racuna, pokusajte ponovo");
				}
				break;
			case 0:
				if (racun != 0)
					System.out.println("Neuspesno placanje racuna");
				else
					System.out.println("Hvala!");
			}
		} while (opcija > 0 && opcija <= 2);

	} }
	