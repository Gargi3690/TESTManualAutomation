package day11jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Framehandling {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		 driver.switchTo().frame("iframeResult");
		 WebElement element =  driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']"));
		 driver.switchTo().frame(element);
		 
		 String txtLogin = driver.findElement(By.xpath("//a[@id='w3loginbtn']")).getText();
		 System.out.println("TextLogin:"  +txtLogin);
		 
		 System.out.println(driver.findElement(By.id("navbtn_menu")).getText());
		 
		 driver.switchTo().parentFrame();
		 
		 System.out.println (driver.findElement(By.xpath("//h1")).getText());
		 
		 driver.switchTo().defaultContent();
		 
		 System.out.println(driver.findElement(By.id("getwebsitebtn")).getText());
		 
		 
		
		
	}
 
}
