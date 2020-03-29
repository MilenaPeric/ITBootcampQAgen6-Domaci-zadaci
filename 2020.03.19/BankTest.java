package Bank;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest {
	private Bank bank;
	private Account ac;
	private Account ac1;
	private SoftAssert sa;


	@BeforeClass
	public void pocetak() {
		bank = new Bank();
		ac = new Account("Milena");
	    ac1 = new Account("Nemanja", "1234567891234");
		sa = new SoftAssert();
	}
	@Test 
	public void testTransfer() {
		Bank mobi = new Bank();

		Account ac2 = mobi.openAccount("Ivana");
		Account ac3 = mobi.openAccount("Milica");
		ac2.setAmount(10000.0);
		mobi.transferMoney(ac2.getNumber(), ac3.getNumber(), 1000.0);
		double iznos1 = ac2.getAmount();
		double iznos2 = ac3.getAmount();
		Assert.assertEquals(iznos1, 9000.0);
		Assert.assertEquals(iznos2, 1000.0);
	}

	@Test
	public void testBankConstructor() {
		List<Account> accounts = new ArrayList<>();
		Assert.assertEquals(accounts.isEmpty(), true);
	}

	@Test
	public void testSumMoney() {
		bank.reset();
		Account r1 = bank.openAccount("Sandra");
		r1.setAmount(500.00);
		Account r2 = bank.openAccount("Sanja");
		r2.setAmount(500.00);
		double suma = bank.getSumMoney();
		Assert.assertEquals(suma, 1000.00);
	}

	@Test
	public void testOpenAccount() {
		String AcN1 = bank.openAccount("Milija").getNumber();
		String AcN2 = bank.openAccount("Nikola").getNumber();
		String AcN3 = bank.openAccount("Sasa").getNumber();
		String AcN4 = bank.openAccount("Tijana").getNumber();
		String AcN5 = bank.openAccount("Nina").getNumber();
		sa.assertEquals(bank.getAccount(AcN1).getNumber(), AcN1);
		sa.assertEquals(bank.getAccount(AcN2).getNumber(), AcN2);
		sa.assertEquals(bank.getAccount(AcN3).getNumber(), AcN3);
		sa.assertEquals(bank.getAccount(AcN4).getNumber(), AcN4);
		sa.assertEquals(bank.getAccount(AcN5).getNumber(), AcN5);

	}

	
	@Test
	public void testPayInMoney() {
		Double iznos = ac.getAmount();
		String brRacuna = ac.getNumber();

		bank.payInMoney(brRacuna, 500.00);
		sa.assertEquals(iznos + 500.00, ac.getAmount());

	}

	@Test
	public void testGetAccount() {
		String pregledAc = ac1.getNumber();
		sa.assertEquals(bank.getAccount(pregledAc), pregledAc);
	}

}