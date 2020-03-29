package Domaci;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0326 {

	public static void main(String[] args) {
		/*Koristeci Selenium webdriver otici na sajt
		 *  https://www.techlistic.com/p/selenium-practice-form.html
		 *   i popuniti formu (idealno celu, ako ne ide onda probajte bar do kontinenta)
		 *   Potrudite se da koristite vise lokatora za pronalazenje elemenata.
*/         
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		WebElement elem=driver.findElement(By.name("firstname"));
		elem.click();
		elem.sendKeys("Milena");
		driver.findElement(By.name("lastname")).sendKeys("Peric");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.cssSelector("input[id=exp-0]")).click();
		driver.findElement(By.id("datepicker")).sendKeys("28.03.2020");
		driver.findElement(By.cssSelector("input#profession-1")).click();
		
		List<WebElement> tools= driver.findElements(By.name("tool"));
		for(int i =1; i<tools.size(); i++) {
			tools.get(i).click();
		}
		elem=driver.findElement(By.cssSelector("select#continents"));
		elem.sendKeys("Europe");

		

		driver.findElement(By.xpath("//option[contains ( text(),'Browser Commands')]")).click();
	    driver.findElement(By.id("photo")).sendKeys("C:\\Users\\hp-840g1\\Downloads\\logo_itbootcamp.png");
	  
	    driver.findElement(By.linkText("Click here to Download File")).click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //elem= driver.findElement(By.cssSelector("a.HeaderMenu-link.no-underline.mr-3"));
	   //System.out.println(elem);
	   // elem.click();

	    driver.navigate().back();
	    driver.navigate().refresh();
	    

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    
	   
	  
		
		

		//driver.close();*/
		

	}

}
