package day5jul;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	
	public static void main(String[] args ) throws InterruptedException
	{
		WebDriver  driver = new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.manage().window().maximize();
	
		//WebElement element1 = driver.findElement(By.name("username"));
		//element1.sendKeys("Cyber Sucess");
		
	      driver.findElement(By.name("username")).sendKeys("Cyber Sucess");
	      
	      Thread.sleep(2000);
	      
	      //driver.findElement(By.name("password")).sendKeys("12345");
	      
	      List<WebElement> low =driver.findElements(By.className("ZmCOM"));
		  System.out.println("low size :" +low.size());
		  
		  
		  low.get(0).sendKeys("facebook.com");
		  
		  low.get(1).clear();
		  Thread.sleep(3000);
		  low.get(1).sendKeys("India");
		  low.get(2).sendKeys("India@123");
		  
		  List<WebElement> low1 = driver.findElements(By.tagName("button"));
		  System.out.println("low size :" +low1.size());
		  
          String hyperlinkText = low1.get(0).getText();
          System.out.println("hyperlinkText: " +hyperlinkText);
          
          Thread.sleep(3000);
          
          driver.get("https://www.letskodeit.com/practice");
          
          WebElement signinlink =driver.findElement(By.linkText("SIGN IN"));
          signinlink.click();
		  
          //WebElement signinlink =driver.findElement(By.linkText("SIGN IN"));
          //signinlink.click();
          
          //OR
          //driver.findElement(By.linkText("SIGN IN")).click();
          
          driver.findElement(By.partialLinkText("SIGN")).click();
          
          //driver.findElement(By.partialLinkText("GNI")).click();
		  
		  
	}

}
