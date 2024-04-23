import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.size());
		Iterator<String> it=wins.iterator();
	 String parent=it.next();
	String child=it.next();
		driver.switchTo().window(child);
		
	
	
	
	driver.findElement(By.xpath("//a[normalize-space()='Global Privacy Resources for Salesforce Products']")).click();
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("henry00");
	Thread.sleep(2000);
	driver.quit();
	
		
	
	}

}
