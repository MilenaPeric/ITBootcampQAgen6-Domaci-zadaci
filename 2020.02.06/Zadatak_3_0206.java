import java.util.Scanner;

public class Zadatak_3_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Molim vas unesite naziv meseca:");
Scanner sc= new Scanner (System.in);
String mesec=sc.next();
switch (mesec) {
case "Januar" : 
case "Jun":
case "Jul":
	System.out.println("Na slovo J pocinju 3 meseca: januar,jun i jul");
break;
case "februar":
	System.out.println("Na slovo F ima jedan mesec");
	break;
case "mart" :
case "maj":
	System.out.println("Na slovo M pocinju 2 meseca: mart i maj");
	break;
case "april": 
case "avgust":
	System.out.println("Na slovo A pocinju 2 meseca: april i avgust");
	break;
case "septembar":
	System.out.println("Na slovo S pocinje jedan mesec");
	break;
case "oktobar": 
	System.out.println("Na slovo O pocinje jedan mesec");
	break;
case "novembar":
	System.out.println("Na slovo N pocinje jedan mesec");
	break;
case "decembar":
	System.out.println("Na slovo D pocinje jedan mesec");
	break;
	default: 
		System.out.println("Pogresan unos naziva meseca.Molimo vas unesite ponovo.");
}

	










	}

}
