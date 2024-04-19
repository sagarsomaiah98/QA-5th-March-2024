package Sel_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bing.com");
driver.get("https://www.orangehrm.com");
driver.get("https:///www.saucedemo.com");

//driver.quit();
	}

}
