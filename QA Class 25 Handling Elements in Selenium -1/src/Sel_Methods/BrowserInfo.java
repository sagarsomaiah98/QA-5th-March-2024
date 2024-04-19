package Sel_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInfo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		String title=driver.getTitle();
		System.out.println(title);
		String page=driver.getPageSource();
      System.out.println(page);
	}

}
