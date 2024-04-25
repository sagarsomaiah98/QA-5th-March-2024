import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	WebElement tables=	driver.findElement(By.xpath("//table[@id='table1']"));//capture the table with xpath
	
	List<WebElement> rows=tables.findElements(By.tagName("tr"));//filter rows using tagname tr
	System.out.println(rows.size());//total number of rows
	 
	List<WebElement> row1=rows.get(1).findElements(By.tagName("td"));//mention the row
	System.out.print(row1.get(0).getText()+" | ");//mention the col
	System.out.print(row1.get(1).getText()+" |");
	System.out.print(row1.get(2).getText()+" | ");
	System.out.println();
	
	List<WebElement> row2=rows.get(2).findElements(By.tagName("td"));//mention the row
	System.out.print(row2.get(0).getText()+" | ");//mention the col
	System.out.print(row2.get(1).getText()+" |");
	System.out.print(row2.get(2).getText()+" | ");
	
	System.out.println();
	List<WebElement> row3=rows.get(3).findElements(By.tagName("td"));//mention the row
	System.out.print(row3.get(0).getText()+" | ");//mention the col
	System.out.print(row3.get(1).getText()+" |");
	System.out.print(row3.get(2).getText()+" | ");
	
	System.out.println();
	List<WebElement> row4=rows.get(4).findElements(By.tagName("td"));//mention the row
	System.out.print(row4.get(0).getText()+" | ");//mention the col
	System.out.print(row4.get(1).getText()+" |");
	System.out.print(row4.get(2).getText()+" | ");
	
	
	
	
	
	driver.quit();
	   
	

	}

}
