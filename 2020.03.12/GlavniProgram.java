package Domaci_1;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Putnik p1 = new Putnik("Milena", "Peric", 1400);
		Putnik p2 = new Putnik("Marijana", "Marjanovic", 1800);
		
		Vozac v1 = new Vozac("Nikola", "Nikolic");
		Autobus a = new Autobus("Beograd-Jagodina", v1, 1200, 30);
		System.out.println(v1.getIme()+ " " + v1.getPrezime());
		
		
		p1.dodajNovac(100);
		p1.oduzmiNovac(200);
		p2.dodajNovac(100);
		
		
		a.dodajPutnika(p1);
		a.dodajPutnika(p2);
		a.izbaciPutnika(p2);
		a.postaviVozaca(v1);
		a.ukolniVozaca(v1);
		
		a.ispisiPutnike();
		System.out.println();
		
	}
	}


