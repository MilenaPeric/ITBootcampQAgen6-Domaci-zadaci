package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Polaznik p1 = new Polaznik("Milena", "Peric");
		Laptop l1 = new Laptop("Toshiba");
		l1.dodajPolaznika(p1);
		System.out.println(p1.ispis());
		System.out.println(l1.ispis());	
	}


	}
	    

