import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QA_10 {
	
public static void main(String[] args) throws InterruptedException {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dropdown");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select sel= new Select(dropdown);
		List<WebElement> options=sel.getOptions();
		
		int totalDropDowns=options.size();
		
		System.out.println("total dropdown is ->"+ totalDropDowns);
		
	
		//Starting from 1 because 0th drop down is disabled
		
		for(int i=1;i<totalDropDowns;i++){
			
			sel.selectByIndex(i);
			Thread.sleep(1000);
			
		}
		
		
		
		driver.quit();
		
	}

}
