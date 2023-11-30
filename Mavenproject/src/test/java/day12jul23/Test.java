package day12jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
public class Test {

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("firstname"));
		
		element.sendKeys("Gouri");
		
		Thread.sleep(3000);
		
	    driver.findElement(By.name("lastname")).sendKeys("Mhetri");
		Thread.sleep(2000);
		
	    driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
	    Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("xyzab");
	    
	    Thread.sleep(2000);
	     driver.findElement(By.xpath(("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]/option[11]"))).click();
	     Thread.sleep(2000);
	    
	     
	     driver.findElement(By.xpath(("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]/option[6]"))).click();
	     Thread.sleep(2000);
	     
	     
	    driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]/option[23]")).click();
	    Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@value='1']")).click();
	   
	   Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("(//label[@class='_58mt'])[3]")).click();
	    Thread.sleep(2000);
	    
	    
	  driver.findElement(By.xpath("//select[@name='preferred_pronoun']/option[2]")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Female");
	  
	  Thread.sleep(2000);
	  driver.close();
	    
	    //(//input[@type='radio'])[1]
		
	}
}
