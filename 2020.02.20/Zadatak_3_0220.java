package itbootcamp2;

import java.util.Scanner;

public class Zadatak_3_0220 {

	public static void main(String[] args) {
		/* Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i),
		 *  post dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima
		 *   opisati kako koji primer funkcionise. Napisati po 2 primera o svakom, koristeci promenljive a, b, c
		 *    koje su i deklarisane i definisane (kao sto smo na tabli vezbali na casu)
*/

		Scanner sc = new Scanner(System.in);

		int a = 7, b = 3, c = 2;

		a = --b; // umanjujemo b za 1 pa onda a uzima tu vrednost.Odatle je a=2
		c = --a; // umanjujemo a za 1 pa onda c uzima tu vrednost.Odatle je c=1

		b = ++c; // uvecavamo c za 1 pa onda b uzima tu vrednost.Odatle je b=2
		a = ++b; // uvecavamo b za 1 pa onda a uzima tu vrednost.Odatle je a=3

		b = a--; // prvo je b preuzelo vrednost od a,pa se zatim a umanjilo za 1.Odatle je b=3
		c = a--; // prvo je c preuzelo vrednost od a,pa se zatim a umanjilo za 1.Odatle je c=2

		a = c++; // prvo je a preuzelo vrednost od c,pa se zatim c uvecalo za 1.Odatle je c=3
		b = a++; // prvo je b preuzelo vrednost od a,pa se zatim a uvecalo za 1.Odatle je b=2

		/* konacno je a=3, b=2, c=3 */
		System.out.println("Konacna vrednost:");
		System.out.println("a iznosi " + a);
		System.out.println("b iznosi " + b);
		System.out.println("c iznosi " + c);
		
	}

}
