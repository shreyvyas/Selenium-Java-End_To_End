package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--start-maximized");
//		
//		driver = new ChromeDriver(option);
		
		//as per this line we need to manually change the browser name
		
		driver = DriverFactory.initDriver(ConfigReader.getProperties("browser"));                    
		
		driver.get(ConfigReader.getProperties("url"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
