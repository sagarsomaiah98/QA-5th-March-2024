package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilterTest {
	
	WebDriver driver;
	Select select;
	
	@BeforeMethod
	public void initilization() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}
	
	
	
	@Test
	public void filterLowPrice() throws InterruptedException {
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		select= new Select(dropDown);
		Thread.sleep(2000);
		select.selectByVisibleText("Price (low to high)");
		
		
	}
	@Test
	public void filterHighPrice() throws InterruptedException {
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		select= new Select(dropDown);
		Thread.sleep(2000);
	
		select.selectByVisibleText("Price (high to low)");
	
		
	}
	@Test
	public void filterName() throws InterruptedException {
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		select= new Select(dropDown);
	
		Thread.sleep(2000);
		select.selectByVisibleText("Name (Z to A)");
		
	}
	@AfterMethod
	public void teardown()
	{
			driver.quit();
	}
	

}
