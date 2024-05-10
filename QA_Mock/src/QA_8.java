import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_8 {
	
public static void main(String[] args) {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();;
		
		Set<String> wins=driver.getWindowHandles();
		
		System.out.println("total no of windows ->"+wins.size());
		
		Iterator<String> it= wins.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	
		driver.quit();
		
	}

}
