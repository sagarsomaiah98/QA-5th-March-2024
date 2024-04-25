import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//Thread.sleep(5000);
		
	WebElement table=driver.findElement(By.xpath("//table[@id='contactList']"));
     List<WebElement> rows=   table.findElements(By.tagName("tr"));//stores all the rows
	   
     System.out.println("total number of rows "+rows.size());
    
     //1st row
     
		/*
		 * List<WebElement> rows1 =rows.get(1).findElements(By.tagName("td"));
		 * System.out.println(rows1.size()); System.out.println(rows1.get(1).getText());
		 * System.out.println(rows1.get(2).getText());
		 * System.out.println(rows1.get(3).getText());
		 * 
		 * System.out.println("****************************************************");
		 * List<WebElement> rows2 =rows.get(2).findElements(By.tagName("td"));
		 * System.out.println(rows2.size()); System.out.println(rows2.get(1).getText());
		 * System.out.println(rows2.get(2).getText());
		 * System.out.println(rows2.get(3).getText());
		 * 
		 * System.out.println("****************************************************");
		 * List<WebElement> rows3 =rows.get(3).findElements(By.tagName("td"));
		 * System.out.println(rows3.size()); System.out.println(rows3.get(1).getText());
		 * System.out.println(rows3.get(2).getText());
		 * System.out.println(rows3.get(3).getText());
		 * 
		 * System.out.println("****************************************************");
		 * List<WebElement> rows4 =rows.get(4).findElements(By.tagName("td"));
		 * System.out.println(rows4.size()); System.out.println(rows4.get(1).getText());
		 * System.out.println(rows4.get(2).getText());
		 * System.out.println(rows4.get(3).getText());
		 */
  	
   
   for(int i=1;i<rows.size();i++) {
	   List<WebElement> rw  =rows.get(i).findElements(By.tagName("td"));
	   System.out.print(rw.get(1).getText()+" | ");
	   System.out.print(rw.get(2).getText()+" | ");
	   System.out.print(rw.get(3).getText()+" | ");
	   System.out.println();
	   
   }
   
	}

}
