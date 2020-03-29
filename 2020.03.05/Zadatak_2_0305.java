import java.util.Scanner;

public class Zadatak_2_0305 {

	public static void main(String[] args) {
		/*
		 * Na sahovskoj tabli je red obelezen brojevima 1 2 3 4 5 6 7 8 i kolona takodje
		 * brojevima 1 2 3 4 5 6 7 8. Tabla je obelezena ovako: Na tabli stoje beli pion
		 * i crni skakac. Beli pion pocinje sa dna table a crni skakac sa vrha. Korisnik
		 * prvo unosi poziciju piona kao dva cela broja, a zatim poziciju skakaca, gde
		 * prvi broj predstavlja red, a drugi kolonu. Program treba da ispise da li se
		 * figure nalaze u poziciji da je skakac napadnut. Primeri: 6 4 7 4 ---> skakac
		 * nije napadnut 6 4 5 5 ---> skakac jeste napadnut 2 2 1 1 ---> skakac jeste
		 * napadnut 9 1 6 8 ---> greska u unosu 1 2 3 4 5 6 7 8 2 3 4 5 6 7 8
		 */

		int pozicijaPiona[] = unesiPozicijuFigure("pion");
		int pozicijaSkakaca[] = unesiPozicijuFigure("skakac");
		daLiJeSkakacNapadnut(pozicijaPiona, pozicijaSkakaca);
	}

	public static int[] unesiPozicijuFigure(String figura) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Molimo vas unesite poziciju " + figura);

		int[] pozicijaFigure = new int[2];

		for (int i = 0; i < pozicijaFigure.length; i++) {
			int br = sc.nextInt();
			pozicijaFigure[i] = br;
		}

		System.out
				.println("Pozicija figure " + figura + " je red " + pozicijaFigure[0] + " kolona " + pozicijaFigure[1]);

		return pozicijaFigure;
	}

	public static void daLiJeSkakacNapadnut(int pozicijaPiona[], int pozicijaSkakaca[]) {
		
		boolean daLiJeNeispravnaPozcijaPiona = daLiJeUnosPozicijeNeispravan(pozicijaPiona, "pion");
		boolean daLiJeNeispravnaPozcijaSkakaca = daLiJeUnosPozicijeNeispravan(pozicijaSkakaca, "skakac");

		if(!daLiJeNeispravnaPozcijaPiona && !daLiJeNeispravnaPozcijaSkakaca) {
			if ((pozicijaSkakaca[0] + 1 == pozicijaPiona[0] || pozicijaSkakaca[0] - 1 == pozicijaPiona[0])
					&& (pozicijaSkakaca[1] + 1 == pozicijaPiona[1] || pozicijaSkakaca[1] - 1 == pozicijaPiona[1])) {
				System.out.println("Skakac je napadnut");
			} else {
				System.out.println("Skakac nije napadnut");
			}
		}
	}

	public static boolean daLiJeUnosPozicijeNeispravan(int pozicijaFigure[], String figura) {
		boolean error = false;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < pozicijaFigure.length; i++) {
			if (pozicijaFigure[i] < 0 || pozicijaFigure[i] > 8) {
				System.out.println("Uneli ste nevalidnu poziciju " + figura + "a");
				error = true;
			}
		}
		return error;

	}
}
