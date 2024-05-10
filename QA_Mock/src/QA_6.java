import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_6 {
	
public static void main(String[] args) {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	
		
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
	Alert al= driver.switchTo().alert();
	String alertText=al.getText();
	al.accept();
	System.out.println(alertText);
	
		driver.quit();
		
	}

}
