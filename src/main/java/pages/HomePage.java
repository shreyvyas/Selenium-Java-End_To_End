package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginButton = By.linkText("Login Here");
	By registerButton = By.linkText("Register");
	
	public void clickOnLogin() {
		
		driver.findElement(loginButton).click();
		
	}
	
	public void clickOnRegister() {
		
		driver.findElement(registerButton).click();
		
	}

}
