package predavanje.SeleniumUvod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void main(String args[]) throws Exception {		
		System.setProperty("webdriver.chrome.driver", "src\\predavanje\\SeleniumUvod\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itbootcamp.rs/course/testiranje-softvera/");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\hp-840g1\\Screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.manage().window().setPosition(new Point(0, -2000));
		driver.close();

	}

}
