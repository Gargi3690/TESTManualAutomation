package day11jul23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {

	public static void main(String[] args) throws InterruptedException
	{
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.letskodeit.com/practice");
	       driver.manage().window().maximize();
	       
	       
	       
	       List<WebElement> low  =driver.findElements(By.xpath("//div[@class ='collapse navbar-collapse'][@id='navbar-inverse-collapse']/ul/li"));
	       System.out.println("Low:" +low.size());
	       for(int  i=0;i<low.size();i++)
	       System.out.println(low.get(i).getText());
	}      
	
}


