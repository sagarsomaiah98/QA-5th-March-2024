package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiLoginTest {
	
	public void verifyLogin(String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println(username+ " ->Login Test Passed");
		}
		catch(Exception e) {
			
			System.out.println(username+" -> Login Test Failed");
			String error=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
			System.out.println(error);
		}
		driver.quit();
		
	
	}

	public static void main(String[] args) {
		MultiLoginTest Login = new MultiLoginTest();
		Login.verifyLogin("standard_user","secret_sauce");
		Login.verifyLogin("locked_out_user","secret_sauce");
		Login.verifyLogin("problem_user","secret_sauce");
		Login.verifyLogin("performance_glitch_user","secret_sauce");
		Login.verifyLogin("error_user","secret_sauce");
		Login.verifyLogin("visual_user","secret_sauce");
		Login.verifyLogin("userA","secret_sauce");
		

	}

}
