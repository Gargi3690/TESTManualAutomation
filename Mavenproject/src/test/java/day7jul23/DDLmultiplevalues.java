package day7jul23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DDLmultiplevalues {

	   public static void main(String[] args) throws InterruptedException
	   {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.letskodeit.com/practice");
		   driver.manage().window().maximize();
		   
		   WebElement dropdownlist = driver.findElement(By.id("multiple-select-example"));
		   
		   
		   
		   Select select = new Select(dropdownlist);
		   boolean result =select.isMultiple();
		   System.out.println("It has multiple selection?:" +result);
		   select.selectByVisibleText("Peach");
		   
		   Thread.sleep(3000);
		   
		   //select.selectByVisibleText("Orange");
		   
		   
		   Thread.sleep(3000);
		   
		   //select.selectByVisibleText("Apple");
		   
		   select.selectByValue("orange");
		   
		   Thread.sleep(3000);
		   
		   select.selectByIndex(0);
		   
		   select.deselectAll();
		   
			/*
			 * for(int ind=0;ind<=2;ind++) { Thread.sleep(3000); select.selectByIndex(ind);
			 * }
			 */
		   
		   Thread.sleep(3000);
		   int i=0;
		   while(i<=2)
			  
			   select.selectByIndex(i++);
		   
		   
		   List<WebElement> low = select.getAllSelectedOptions();
		   System.out.println("Get Selected info:");
		   
		   System.out.println(low.size());
		   System.out.println(low.get(0).getText());
		   System.out.println(low.get(1).getText());
		   System.out.println(low.get(2).getText());
		   
		   
		   select.deselectByVisibleText("Peach");
		   //WebElement element1= select.getFirstSelectedOption();
		   //System.out.println("first option:" +element1);
		   
		   i=0;
		   while(i<=2)
			   select.deselectByIndex(i++);
		   
		   
		       
		   
		   
		   
	   }
}
