package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ForgotPasswordPage;
import pages.LoginPage;
import testbase.TestBase;
import testutil.TestUtil;

public class ForgotPasswordTest extends TestBase{
	
	
	@BeforeMethod
	public void init() throws IOException {
		intialization(); 
		 
		
	}
	
	@Test
	public void verifyForgottenPassword() throws IOException {
		ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage();
		forgotpasswordpage.clickForgottenPassword();
		
		String expected=forgotpasswordpage.forgotYourPassword.getText();
		assertEquals(expected, "Forgot Your Password?");
		System.out.println(driver.getTitle());
		TestUtil.Screenshot();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
