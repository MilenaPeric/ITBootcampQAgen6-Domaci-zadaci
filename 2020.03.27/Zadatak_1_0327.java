package Domaci;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0327 {

	public static void main(String[] args) {
		/*Pomocu jave i selenijuma
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
// voditi racuna da ako postoje reklame da ih preskocite

Dodatni zadatak
Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video

*/ 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.youtube.com");
		driver.findElement(By.id("search")).sendKeys("Rick Astley Never gonna give you up");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		
		 
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Rick Astley - Never Gonna Give You Up (Video)')]")).click(); 
	
		skipAd(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Mix - Rick Astley - Never Gonna Give You Up (Video)')]")).click();
		skipAd(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Michael Jackson - Billie Jean (Official Video)')]")).click();
		
	}
	public static void skipAd( WebDriver driver) {
		
		if(driver.findElements(By.xpath("//*[text() = 'Skip Ad']")).size() > 0)
		{
		driver.findElement(By.xpath("//*[text() = 'Skip Ad']")).click();

		}
	}
	}
	
