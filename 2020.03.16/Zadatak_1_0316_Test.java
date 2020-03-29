package domaci.SeleniumZadatak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Zadatak_1_0316_Test  {

	@Test
	public void title() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp-840g1\\Downloads\\chromedriver_win32 (2)");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itbootcamp.rs/course/testiranje-softvera/");

		Assert.assertEquals(driver.getTitle(), "Testiranje softvera (QA) - Beograd - ITBootcamp");

	}
	 @Test
	  public void Zadatak_1_0316() {}
	  
}