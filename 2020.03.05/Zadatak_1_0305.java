import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1_0305 {

	public static void main(String[] args) {
		// Domaci zadatak od utorka “da li je niz celih brojeva palindrom ili nije”
		// uradi koristeci metode.
		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom). Korisnik unosi int [ ]
		 */
		int[] niz = ucitajNiz(5);
		ispisiNiz(niz);
		int[] pal = vratiPal(niz);
		ispisiNiz(pal);
		daLiJePalindrom(niz, pal);
	}

	public static int[] ucitajNiz(int brElem) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Molimo vas unesite koliko elemenata zelite u nizu");
		int n = sc.nextInt();

		int[] brojevi = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Molimo vas unesite " + (i + 1) + ". element niza");
			int br = sc.nextInt();
			brojevi[i] = br;
		}
		System.out.println("Niz je: ");

		return brojevi;
	}

	public static int[] vratiPal(int[] brojevi) {

		int[] pal = new int[brojevi.length];

		for (int i = 0; i < brojevi.length; i++) {
			pal[(brojevi.length - 1) - i] = brojevi[i];
		}
		System.out.println("Obrnuti niz je: ");

		return pal;
	}

	public static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i] + " ");
		}
	}

	public static void daLiJePalindrom(int niz[], int[] pal) {
		if (Arrays.equals(niz, pal)) {
			System.out.println("Niz je palindrom");

		} else {
			System.out.println("Niz nije palindrom");
		}
	}
}
