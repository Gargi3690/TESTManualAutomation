package day17jul23;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BlinkDemo1 {

	public static void main(String[] args) throws InterruptedException
	{
	
	WebDriver driver = new ChromeDriver();
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//clicking on CREATE NEW ACCOUNT button 
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement first = driver.findElement(By.name("firstname"));
        highlight(js,first,"Gouri",50);
		
        
        WebElement txtLastName = driver.findElement(By.name("lastname"));
    	highlight(js,txtLastName, "Mhetri",50);
    	
    	
    	WebElement txtEmail = driver.findElement(By.name("reg_email__"));
    	highlight(js,txtEmail,"gouri@gmail.com",50);

	}

	 static void highlight(JavascriptExecutor js, WebElement element, String data, int ticks) {
		 for(int i=0;i<=ticks;i++)
		 {
			 if(i%2==0)
				 js.executeScript("arguments[0].style.backgroundColor='red'", element);
			 else
				 js.executeScript("arguments[0].style.backgroundColor='white'", element);
		 }
		    js.executeScript("arguments[0].style.backgroundColor='white'", element);
		    element.sendKeys(data);
		
	}

}

