import java.util.Scanner;

public class Zadatak_2_0228 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Molimo Vas unesti koliko broja zelite u nizu:");
		int n = sc.nextInt();

		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Molimo Vas unesite elemente niza:" + i);
			niz[i] = sc.nextInt();
		}
		
		System.out.print("Redosled brojeva u nizu je:");
		for (int i = 0; i < niz.length; i++) {
			if(i == niz.length-1) {
				System.out.println(niz[i] + " ");
			}
			System.out.print(niz[i] + " ");
		}

		System.out.print("Inverzni redosled brojeva u nizu je:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}

	}

}
