package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import testbase.TestBase;
import testutil.TestUtil;

public class LoginTest extends TestBase {
	LoginPage login;

	
	
	@BeforeMethod
	public void init() throws IOException {
		intialization(); 
		 login= new LoginPage();
		
	}
	@Test
	public void validLogin() throws IOException, InterruptedException {
		
		Thread.sleep(2000);
		
		
		login.login("BruceWayne123@gmail.com", "123456789");
		TestUtil.Screenshot();
	
	}
	
	@Test
	public void invalidLogin() throws IOException, InterruptedException {
		
		Thread.sleep(2000);
		login= new LoginPage();
		
		login.login("username1@gmail.com", "123456789");
		TestUtil.Screenshot();
	
		
	}


	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
