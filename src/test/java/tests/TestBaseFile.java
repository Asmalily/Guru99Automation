package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBaseFile {
	
	public static WebDriver driver ; 

	@BeforeSuite
	public void startDriver() {
		
//{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();

	driver.manage().window().maximize();
	Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(120 ,TimeUnit.SECONDS);
	driver.navigate().to("https://www.demo.guru99.com/V4/");
}
	
	@AfterSuite
	public void stopDriver() {
		driver.quit();
	}
}
