import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_4 {
	
public static void main(String[] args) {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("total no of links => "+links.size());
		
		for(int i=0;i<links.size();i++) {
			
		String linkText=	links.get(i).getText();
		System.out.println(linkText);
		}
	
	
		driver.quit();
		
	}

}
