package predavanje.SeleniumUvod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_4_0228 {

	public static void main(String[] args) {
		/*
		 * Dodatni neobavezni zadatak Selenium Pomocu jave i seleniuma otvoriti
		 * pretrazivac i otici na Youtube. Pet puta kliknuti na dugme refresh, i tek
		 * onda zatvoriti pretrazivac.
		 */
		System.setProperty("webdriver.chrome.driver", "src\\predavanje\\SeleniumUvod\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.get("https://www.youtube.com");
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.manage().window().setPosition(new Point(0, -2000));
		driver.close();

	}

}
