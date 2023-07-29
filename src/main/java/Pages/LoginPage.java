package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name=("uid"))
	WebElement UserID;
	
	@FindBy(name=("password"))
	WebElement password;
	
	@FindBy(name=("btnLogin"))
	WebElement Btnlogin;
	
	@FindBy(name=("btnReset"))
	WebElement BtnReset;
	
	@FindBy(linkText=("Manger Id : mngr518550"))
	public
	WebElement LoginMsg;
	
	public void UserCanLogin(String userID , String Password ) {
		
		setTextElementText(UserID, userID);
		setTextElementText(password, Password);
		clickButton(Btnlogin);
		
		
	}

}
