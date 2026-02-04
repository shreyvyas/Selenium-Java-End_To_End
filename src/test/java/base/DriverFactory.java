package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {	
	
	public static WebDriver initDriver(String browser) {
		
		WebDriver driver;
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			driver = new ChromeDriver(option);
			break;
		
		case "firefox":
//			FirefoxOptions firefoxOptions = new FirefoxOptions();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--start-maximized");
			driver = new EdgeDriver(edgeOptions);
			break;
			
		default:
			
			throw new IllegalArgumentException("Invalid Browser: " +browser);
		
		}
		return driver;
	}
	

}
