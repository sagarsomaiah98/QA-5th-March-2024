import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_5 {
	
public static void main(String[] args) {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
	
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String laptopText=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println(laptopText);
	
		driver.quit();
		
	}

}
