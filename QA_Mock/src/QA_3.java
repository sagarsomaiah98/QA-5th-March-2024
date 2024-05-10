import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QA_3 {
	
public static void main(String[] args) throws InterruptedException {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement drop =driver.findElement(By.xpath("//select[@id='drop1']"));
		
		Select sel = new Select(drop);
		
		sel.selectByValue("def");
	
		Thread.sleep(2000);
		driver.quit();
		
	}

}
