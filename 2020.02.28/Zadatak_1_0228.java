import java.util.Scanner;

public class Zadatak_1_0228 {

	public static void main(String[] args) {
		//Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program ispisuje elemente niza deljive brojem br.

		Scanner sc = new Scanner(System.in);
		System.out.println("Molimo Vas unesti koliko broja zelite u nizu:");
		int n = sc.nextInt();
		int m = 0; 

		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Molimo Vas unesite elemente niza:" + i);
			niz[i] = sc.nextInt();
		}

		System.out.println("Molimo Vas unesite broj sa kojim zelite da delite elemene niza");
		m = sc.nextInt();
		System.out.println("Elemenati niza deljivi sa "+ m + ",su:");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % m == 0)
				System.out.println(niz[i]);

	}
		}
	}
