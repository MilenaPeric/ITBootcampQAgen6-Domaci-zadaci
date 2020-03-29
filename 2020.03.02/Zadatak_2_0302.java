import java.util.Scanner;

public class Zadatak_2_0302 {

	public static void main(String[] args) {
		/*Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza
		 *  koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)*/ 

		
		Scanner sc = new Scanner(System.in);
		float elem = 0;
		float proizvod = 1;

		System.out.println("Molimo vas unesite koliko elemenata zelite u nizu");
		int duzina = sc.nextInt();

		float[] brojevi = new float[duzina];

	
			for (int i = 0; i < duzina; i++) {
				System.out.println("Molimo vas unesite " + (i + 1) + "." + " element niza");
				elem = sc.nextFloat();
				brojevi[i] = elem;
				if (elem > i) {
					proizvod *= brojevi[i];
				}
			
		}
		System.out.print("Niz je: ");
		for (int i = 0; i < duzina; i++) {
			System.out.print(brojevi[i] + ", ");

		}
		System.out.print("\n");
		System.out.println("Proizvod clanova niza koji su veci od svog indeksa je: " + proizvod);
	}

}
