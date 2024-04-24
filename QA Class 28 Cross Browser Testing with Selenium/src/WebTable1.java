import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://omayo.blogspot.com/");

List<WebElement> totalRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
System.out.println(totalRows.size());

  String first="//table[@id='table1']/tbody/tr[";
  String second="]";
    
    
    for(int i=1;i<=totalRows.size();i++) {
    WebElement rows=driver.findElement(By.xpath(first+i+second));
    	String row=rows.getText();
    	System.out.println(row);
    	
    }
    
    


    driver.quit();

	}

}
