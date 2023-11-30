package day7jul23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class labeldemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		String label = driver.findElement(By.xpath("(//legend)[1]")).getText();
		System.out.println("label : " + label);
		
		List<WebElement> low = driver.findElements(By.xpath("//legend"));
		System.out.println("All label:" +low.size());
		
		for(int i=0;i<low.size();i++)
		   System.out.println(low.get(i).getText());
		
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Gouri");
		
		String text =driver.findElement(By.xpath("//input[@id='autosuggest'][@type='text']")).getAttribute("value");
		System.out.println("txt:" +text);
		
	}
	
}
