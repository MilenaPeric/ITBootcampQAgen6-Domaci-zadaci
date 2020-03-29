package domaci.SeleniumZadatak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0316 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\domaci\\SeleniumZadatak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itbootcamp.rs/course/testiranje-softvera/");

		String title = driver.getTitle();
		System.out.println("Title je: " + title);
		int duzina = driver.getTitle().length();
		System.out.println("Duzina title je: " + duzina + "karaktera");

		driver.close();

	}

}

