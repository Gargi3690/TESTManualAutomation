package day12jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
	public static void main(String[] args)
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.letskodeit.com/practice");
		 driver.manage().window().maximize();
		 
		 //int row = 2,col =2;
		  String txt = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[2]/td[2]")).getText();
		  System.out.println("txt:" +txt);		
	}
	
}
