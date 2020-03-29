import java.util.Scanner;

public class Zadatak_3_0228 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Molimo Vas unesite koliko broja zelite u nizu:");
		int n = sc.nextInt();
		boolean desc = false;

		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Molimo Vas unesite elemente niza:" + i);
			niz[i] = sc.nextInt();
		}
		for (int i = 0; i < niz.length-1; i++) {
			if (niz[i] > niz[i+1]) {
				desc = true;
				break;
				
			}	
		}
		
		if(desc) {
			System.out.println("Niz je opadajuci");
		} else {
			System.out.println("Niz je rastuci");
		}
	}
}
