package day7jul23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {

	
	 public static void main(String[] args) throws InterruptedException 
	   {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.letskodeit.com/practice");
		   driver.manage().window().maximize();
		   
		   
		   driver.findElement(By.id("name")).sendKeys("Gouri");
		   
		   driver.findElement(By.id("alertbtn")).click();
		   
		   Thread.sleep(3000);
		   Alert alert = driver.switchTo().alert();
		   alert.accept();
		   
		   
		   

		   driver.findElement(By.id("name")).sendKeys("Ridya");
		   
		   driver.findElement(By.id("confirmbtn")).click();
		   
		   Thread.sleep(3000);
		   alert = driver.switchTo().alert();
		   alert.accept();
		   
		   //alert.dismiss();
	   }
}
