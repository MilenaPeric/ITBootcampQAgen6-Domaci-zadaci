package Domaci;

public class GlavniProgram {

	public static void main(String[] args) {
		/*
		 * Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
		 * Koristeci selenijum, napravi screenshot svog okacenog domaceg zadatka na
		 * drajvu. Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i
		 * sliku(screenshot).
		 * 
		 * 
		 * Dodatni domaci: napravi niz koji ce imati sve klubove za koje je sportista
		 * igrao.
		 * 
		 */
		Sportista s1 = new Sportista("Jova", "Jovanovic", 1995);
		Sportista s2 = new Sportista("Boris", "Borkovic", 1992);
		Sportista s3 = new Sportista("Nemanja", "Nemanjic", 1994);

		Klub k1 = new Klub("Partizan", "Beograd", 1938);

		k1.dodajSportistu(s1);
		k1.dodajSportistu(s2);

		System.out.println(k1.toString());
		
		Klub k2 = new Klub("Zvezda", "Beograd", 1938);

		
		Sportista2 s4 = new Sportista2("Jova", "Jovanovic", 1995);
		s4.dodajKlub(k1);
		s4.dodajKlub(k2);
		
		System.out.println(s4.toString());

	}
}
