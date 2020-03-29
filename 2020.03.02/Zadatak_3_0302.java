import java.util.Scanner;

public class Zadatak_3_0302 {

	public static void main(String[] args) {
		//Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju slovom d.

Scanner sc = new Scanner(System.in);
		
		String recenica = sc.nextLine();
		String[] reci = recenica.split(" ");
		
		int broj = 0;
		
		for (int i=0; i< reci.length; i++) {
			String r = reci[i];
			if (r.charAt(0) == 'd') {
				broj ++;
			}
		}
		
		System.out.println("Ima " + broj + " reci koje pocinju na d");
		
		reci = recenica.split("d ");
		System.out.println(reci.length);

	}

}
