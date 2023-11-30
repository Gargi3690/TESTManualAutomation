package day7jul23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownlist {


	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
	    WebElement dropDownlist = driver.findElement(By.id("carselect"));
	    
	    Select select = new Select(dropDownlist);
		
	    select.selectByVisibleText("BMW");
	    Thread.sleep(4000);
	    select.selectByVisibleText("Honda");
	    Thread.sleep(4000);
	    select.selectByVisibleText("Benz");
	    
	    Thread.sleep(4000);
	    select.selectByValue("honda");
	    Thread.sleep(4000);
	    select.selectByIndex(1);
	    
	    Thread.sleep(4000);
	    
	    for(int ind=0;ind<=2;ind++)
	    {
	    	 Thread.sleep(4000);
	    	 select.selectByIndex(ind);
	    }
	    
	    List<WebElement> options =select.getOptions();
	    System.out.println("total options present in the DrooDownlist :" +options.size());
	    
	    for(int ind=0;ind<options.size();ind++)
	    {
	    	System.out.println(options.get(ind).getText());
	    }
	    
	    boolean result = select.isMultiple();
	    System.out.println("ismultiple: "+result);
	}
	
}
