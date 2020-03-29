
public class GlavniProgram_Sportista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sportista sportista1 = new Sportista("Jovan", "Jovanovic", "fudbal", "Partizan", 14);
		Sportista sportista2 = new Sportista("Nemanja", "Nemanjic", "fudbal", "Crvena zvezda", 4);
		Sportista sportista3 = new Sportista("Zoran", "Zoric", "kosarka", "Partizan", 7);
		System.out.println(sportista1.dohvatiIme());
		System.out.println(sportista1.dohvatiPrezime());
		System.out.println(sportista1.dohvatiBrojDresa());
		sportista1.promeniBrojDresa(15);
		System.out.println(sportista1.dohvatiBrojDresa());
		System.out.println(sportista1.dohvatiKlub());
		sportista1.promeniKlub("Spartak");
		System.out.println(sportista1.dohvatiKlub());
		System.out.println(sportista1.dohvatiSport());
	
	}
	
}
