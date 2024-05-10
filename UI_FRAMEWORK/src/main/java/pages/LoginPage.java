package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	@FindBy(xpath="//span[normalize-space()='My Account']\"")
	WebElement myAccount;

	
	
	public LoginPage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String pwd) {
		email.sendKeys(uname);
		password.sendKeys(pwd);
		login.submit();
	}

}
