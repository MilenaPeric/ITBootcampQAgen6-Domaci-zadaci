import java.util.Scanner;

public class Zadatak_2_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int nosivost = 680;
		int brojosoba;
		float tezinaosoba;
		int maxosoba = 6;
		float tezinalifta = 0;
		int x = 1;

		System.out.println("Molimo vas unesite broj osoba");

		brojosoba = s.nextInt();

		if (brojosoba > maxosoba)

			System.out.println("U liftu je maksimalan broj osoba 6!");
		else {
			while (x <= brojosoba) {

				System.out.print("Molimo vas unesite tezinu osobe");
				tezinaosoba = s.nextFloat();
				x = x + 1;
				tezinalifta = tezinalifta + tezinaosoba;
			}

			System.out.print("Ukupna tezina lifta je" + tezinalifta);
			if (nosivost > tezinalifta)
				System.out.println("Lift je pokrenut");
			else if (nosivost == tezinalifta)
				System.out.println("Opterecenje lifta je na granici!");
			else
				System.out.println("Lift je preopterecen!");

		}
	}
}
