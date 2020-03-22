package base;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Congfigclass {
	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void startBrowser() {
		System.out.println("This will run before test starts.");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashif\\Documents\\GitHub\\Java-Core-Class-Repo\\SeleniumBatch2019\\Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void landingPage() throws Exception {
		System.out.println("This will write during the test");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#txtUsername")).clear();
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("admin");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		System.out.println("This will run after test is done.");
	}
}
