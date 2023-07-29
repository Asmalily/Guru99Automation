package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	//constructor
 public PageBase (WebDriver driver) {

	 PageFactory.initElements(driver, this);
 }
 protected void clickButton(WebElement button) {
	 /// for any button click
	 button.click();
 }
 ///for Send Keys
 protected void setTextElementText(WebElement textElement,String value) {
	 textElement.sendKeys(value);
 }
 

}
