package tests;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends TestBaseFile {

	LoginPage LoginObject;
	
	@Test
	public void LoginSuccess() {
		
		LoginObject = new LoginPage(driver);
		LoginObject.UserCanLogin("mngr518550", "bequdUg");
	
	}
	
	
}
