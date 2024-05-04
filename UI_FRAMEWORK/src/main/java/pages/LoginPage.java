package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	WebElement email=driver.findElement(By.xpath("//input[@id='input-email']"));
	WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
	WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
	WebElement myAccount=driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	
	
	
	public void login(String uname, String pwd) {
		email.sendKeys(uname);
		password.sendKeys(pwd);
		login.submit();
	}

}
