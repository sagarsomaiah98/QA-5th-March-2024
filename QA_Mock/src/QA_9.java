import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_9 {
	
public static void main(String[] args) {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/my-account/");
		
	
		driver.findElement(By.xpath("//a[normalize-space()='Lost your password?']")).click();
		String text=driver.findElement(By.xpath("//p[contains(text(),'Lost your password? Please enter your username or ')]")).getText();
	    System.out.println(text);
		driver.quit();
		
	}

}
