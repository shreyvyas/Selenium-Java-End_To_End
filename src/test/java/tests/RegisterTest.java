package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;


public class RegisterTest extends BaseTest{
	
	@Test
	public void test002() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnRegister();

		
	}

}
