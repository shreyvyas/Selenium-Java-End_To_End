package tests;

//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;


public class LoginTest extends BaseTest{
	
	//WebDriver driver;
	
//	@BeforeTest
//	public void setup() {
//		
//		driver = new ChromeDriver();
//		driver.get("https://qtripdynamic-qa-frontend.vercel.app/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//	}
	
	@Test
	public void test001() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnLogin();
		
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}
