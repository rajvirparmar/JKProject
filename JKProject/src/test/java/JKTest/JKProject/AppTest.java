package JKTest.JKProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest 
{
	WebDriver driver = null;
	@BeforeTest
	public void inti() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void appnavigation() {
		driver.get("https://facebook.com/"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
