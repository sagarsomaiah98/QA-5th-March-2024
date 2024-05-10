import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class QA_7 {
	
public static void main(String[] args) throws InterruptedException {
	

      
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://www.infoedge.in/");
		
		Actions ac =new Actions(driver);
		WebElement businessMenu=driver.findElement(By.xpath("//a[@id='btn2']"));
		ac.moveToElement(businessMenu).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='m2']//a[normalize-space()='Overview']")).click();
	
		driver.quit();
		
	}

}
