package day1oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Workplace\\Selenium\\chromedriver-win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bhaane.com");
		driver.manage().window().maximize();
		
		//This code for first Subscribe the mail list(signup)
		//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("gargi@gmail.com");
		
		//driver.findElement(By.className("sign_up")).click();
		
		driver.findElement(By.xpath("//div[@class='cross_sign md']")).click();
		
		
		  driver.findElement(By.xpath("//header//div//div[4]//li[2]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"modal-login\"]/div/form/div[4]/div")).
		  click();
		  
		  driver.findElement(By.name("first_name")).sendKeys("gargi");
		  driver.findElement(By.name("last_name")).sendKeys("mhetri");
		  driver.findElement(By.xpath(
		  "//*[@id=\"modal-register\"]/div/form/div[1]/div[3]/div/input")).sendKeys(
		  "ridya01@gmail.com");
		  driver.findElement(By.name("mobile")).sendKeys("7499323010");
		  driver.findElement(By.xpath("//div[5]//input")).sendKeys("gargi@123");
		  
		 driver.findElement(By.xpath("(//button)[3]")).click();
		 
		 
		 JavascriptExecutor js =  (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,1000);", "");
			
			
	     Thread.sleep(3);
		js.executeScript("window.scrollBy(0,-1000);", "");
		  
		Thread.sleep(4);
		driver.findElement(By.xpath("//header//div[1]//ul//li[1]//a")).click();
		
		driver.findElement(By.xpath("//header//div[2]//ul/li[2]//a")).click();
		
		Thread.sleep(4);
		
		driver.findElement(By.xpath("//*[@id=\"products\"]/div[2]/a/div/img[1]")).click();
		
		driver.findElement(By.xpath("(//form)[6]//div/label[2]")).click();
		
		driver.findElement(By.xpath("(//button)[4]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"modal-bag\"]/div/div[1]/div[3]/a[2]")).click();
		
		
		
		
	}
}