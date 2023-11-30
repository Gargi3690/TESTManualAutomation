package day17jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement first = driver.findElement(By.name("firstname"));
		
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow;');",first );
	    first.sendKeys("Gouri");
	    Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid grey; background:white;');",first );
	    
	    WebElement last = driver.findElement(By.name("lastname"));
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid pink; background:blue;');",last );
	    last.sendKeys("Mhetri");
        Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid grey; background:white;');",last );
	    
	    WebElement mail = driver.findElement(By.name("reg_email__"));
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow;');", mail);
	    mail.sendKeys("gouri@gmail.com");
	    
        Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid grey; background:white;');",mail );
	    
	    
	    WebElement ReMail = driver.findElement(By.name("reg_email_confirmation__"));
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid pink; background:navyblue;');",ReMail);
	    ReMail.sendKeys("gouri@gmail.com");
        Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid grey; background:white;');",ReMail );
	    
	    
	    WebElement pwd = driver.findElement(By.name("reg_passwd__"));
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid pink; background:navyblue;');",pwd);
	    pwd.sendKeys("abcd");
	    Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border:2px solid grey; background:white;');",pwd );
	    
	    
	   
	    
	    String val = driver.findElement(By.name("firstname")).getAttribute("value");
	    System.out.println("value :" +val);
	    
	    String val1 = driver.findElement(By.name("firstname")).getText();
	    System.out.println("Text :" +val1);
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
	}
}


