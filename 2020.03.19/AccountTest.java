package Bank;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AccountTest {

	private Account ac;
	private Account ac1;
	private SoftAssert sa;
	

	@BeforeClass
	public void pocetak() {
		ac = new Account("Milena");
	    ac1 = new Account("Slavisa", "98767");
		sa = new SoftAssert();
	}

	@Test
	public void testKonstruktor() {
		String ime = "Ivana";
		String broj = "5645376";

		Account racun = new Account(ime, broj);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getName(), "Ivana");
		sa.assertEquals(racun.getNumber(), broj);
		sa.assertEquals(racun.getAmount(), 0d);

		sa.assertAll();
	}

	@Test
	public void testAccountNumber() {

		Account[] racuni = new Account[100];

		for (int i = 0; i < racuni.length; i++) {
			racuni[i] = new Account("Pera");
		}
		SoftAssert sa = new SoftAssert();
		for (int i = 0; i < racuni.length; i++) {
			String broj = racuni[i].getNumber();
			for (int j = i + 1; j < racuni.length; j++) {
				sa.assertNotEquals(broj, racuni[j].getNumber());
			}
		}

		sa.assertAll();

	}

	@Test
	public void testGetName() {
		Assert.assertEquals(ac1.getName(), "Slavisa");
	}

	@Test
	public void testGetNumber() {
	
		Assert.assertEquals(ac1.getNumber(), "98767");
	}

	@Test
	public void testGetAmount() {
		ac1.setAmount(500.00);
		sa.assertEquals(ac1.getAmount(), 500d);
	}

	@Test
	public void testSetAmount() {

		Account ac = new Account("Milena", "98765");

		ac.setAmount(500.00);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ac.getAmount(), 500.00);

	}

	@Test
	public void testToString() {

		String ispis = String.format("%s %s %.2f", ac.getNumber(), ac.getName(), ac.getAmount());
		String ispis1 = String.format("%s %s %s %s %.2f", ac.getNumber(), "\t", ac.getName(), "\t", ac.getAmount());
		String actual = ispis;
		String expected = ispis1;

		sa.assertEquals(actual, expected);

	}
}


