package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.RegisterPage;
import testbase.TestBase;
import testutil.TestUtil;

public class RegisterTest extends TestBase {
	
	
	
	@BeforeMethod
	public void init() throws IOException {
		intialization(); 
		
		
	}
	
	@Test
	
	public void verifyRegister() throws IOException {
		RegisterPage registerpage= new RegisterPage();
		
		String email="john"+TestUtil.randomID()+"@gmail.com";
		registerpage.myAccount.click();
		registerpage.register.click();
		registerpage.enterAccountDetails("John", "ken", email, "0412345678", "john123", "john123");
		TestUtil.Screenshot();
		
	}
	
	@Test
	public void verifyWarningMessage() throws IOException {
		RegisterPage registerpage= new RegisterPage();
		registerpage.myAccount.click();
		registerpage.register.click();
		registerpage.Continue.click();
		TestUtil.Screenshot();
		
		assertEquals(registerpage.warningFirstName.getText(), "First Name must be between 1 and 32 characters!");
		assertEquals(registerpage.warningLasttName.getText(), "Last Name must be between 1 and 32 characters!");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
