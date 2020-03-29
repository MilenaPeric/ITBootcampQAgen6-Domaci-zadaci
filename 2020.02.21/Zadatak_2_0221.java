package itbootcamp2;

public class Zadatak_2_0221 {

	public static void main(String[] args) {
		// Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.

		

		int broj = 0;
		int n = 1;

		for (int i = 9; i <= 250; i++) {
			if (i % 3 == 0) {
				broj += n;	
			}
		}
		System.out.println("Izmedju 9 i 250 postoji " + broj + " broja deljivih sa 3");

	}

}
