import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1_0302 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom). Korisnik unosi int [ ]
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Molimo vas unesite koliko elemenata zelite u nizu");
		int n = sc.nextInt();

		int[] brojevi = new int[n];
		int[] pal = new int[n];

		
			for (int i = 0; i < n; i++) {
				System.out.println("Molim vas unesite " + (i + 1) + ". element niza");
				int br = sc.nextInt();
				brojevi[i] = br;
				pal[(n - 1) - i] = br;
			}
			System.out.print("Niz je: ");
			for (int i = 0; i < n; i++) {
				System.out.print(brojevi[i]);
			}
			System.out.println();
			System.out.print("Obrnuti niz je: ");
			for (int i = 0; i < n; i++) {

				System.out.print(pal[i]);
			}
			System.out.println();
			if (Arrays.equals(brojevi, pal)) {
				System.out.println("Niz je palindrom");

			} else {
				System.out.println("Niz nije palindrom");
			}
		}
	}

