package day6jul23;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		
	   driver.findElement(By.xpath("//input[@id='username']"));
		
		
		
	}
	
}
