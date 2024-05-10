package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class ForgotPasswordPage extends TestBase {
	
	 @FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	WebElement forgotPassword;
	 
	 
	 @FindBy(xpath="//input[@value='Continue']")
	WebElement Continue;
	 
	 @FindBy(xpath="//a[@class='btn btn-default']")
	WebElement Back;
	 
	 @FindBy(xpath="emailAddress")
		WebElement emailAddress;
	 
	@FindBy(xpath="//h1[normalize-space()='Forgot Your Password?']")
	public WebElement forgotYourPassword;
	
	public ForgotPasswordPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickForgottenPassword() {
		
		forgotPassword.click();
	}
	
public void typeEmailAddress(String email) {
		
	emailAddress.sendKeys(email);
	}
	
public void clickBack() {
	Back.click();
}

}
