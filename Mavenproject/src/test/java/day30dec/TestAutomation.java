package day30dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://techpub-connect-demo.netlify.app/html/contactus");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//form/div[1]/label/input[@type = 'text']")).sendKeys("Gouri");
		
		driver.findElement(By.xpath("//form//div[2]/label//input[@type= 'text']")).sendKeys("7499323010");
		
		driver.findElement(By.xpath("//form//div[3]/label//input[@type= 'text']")).sendKeys("gourimhetri@gmail.com");
		
		driver.findElement(By.xpath("//form//div[4]/label//input[@type= 'text']")).sendKeys("My name is Gouri.I am writing This msg to get the information about the services the company provided");
		
		
	}
	
}
