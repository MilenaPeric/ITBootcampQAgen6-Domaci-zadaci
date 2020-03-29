package Dete;

public class GlavniProgram {

	public static void main(String[] args) {
		Dete d1 = new Dete("Aleksa", "Aleksandrovic", 5);
		Dete d2 = new Dete("Miroslav", "Radojcic", 3);
	

		d1.dodajBrKlikera(5);
		d2.dodajBrKlikera(10);
		d1.oduzmiKlikere(2);

		System.out.println(d1.getIme() + " " + d1.getPrezime());
		System.out.println("Dete ima " + d1.getBrKlikera() + " klikera");

		System.out.println("Prosek godina je: " + Dete.getPrGpod());

	}

}
