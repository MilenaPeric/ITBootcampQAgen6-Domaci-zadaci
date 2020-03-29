import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0227 {

	public static void main(String[] args) {
		/*
		 * Pomocu jave i seleniuma Otvoriti novi prozor u pretrazivacu i otici na IT
		 * Bootcamp Primeniti metode koje smo vezbali na casu (get URL i Title, navigate
		 * - refresh, to, back, forward) U kodu treba da se prozor maksimizuje, a pre
		 * zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice
		 * okruzenja, ako to ne pomaze, guglajte =) )
		 * 
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp-840g1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().refresh();
		driver.navigate().to("https://itbootcamp.rs/");
		driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");
		driver.navigate().back();

		driver.navigate().forward();
		driver.manage().window().setPosition(new Point(0, -2000));
		String title = driver.getTitle();
		System.out.println("Title je: " + title);
		int duzina = driver.getTitle().length();
		System.out.println("Duzina title je: " + duzina + "karaktera");
		String url = driver.getCurrentUrl();
		System.out.println("Url sajta je: " + url);
		driver.close();

	}

}