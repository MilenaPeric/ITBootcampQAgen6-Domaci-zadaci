package itbootcamp2;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {
		/* Napisati program koji unosi i sabira brojeve dokle god nije unesen 
		 * negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
		 * primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
*/
		Scanner sc = new Scanner(System.in);

		int suma = 0;
		double n = 1;
		int i = 0;
		int j = 1;

		while (i < j) {
			System.out.println("Unesite n vrednost (ceo broj)");
			n = sc.nextDouble();

			if (n % 1 != 0) {
				System.out.println("Niste uneli ceo broj!");
			} else if (n >= 0) {
				suma += n;
				i++;
				j++;
			} else {
				j--;
			}
		}
		System.out.println("Suma je " + suma);

		
		

	}

}
