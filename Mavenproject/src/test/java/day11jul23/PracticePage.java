package day11jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException
	{
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.letskodeit.com/practice");
	       driver.manage().window().maximize();
	       
	       
	       //String label = driver.findElement(By.xpath("//h1[@data-uniqid='1621702280245']")).getText();
	       
	       String label = driver.findElement(By.xpath("//h1[1]")).getText();
	       System.out.println("Text is:" +label);
	}      
}
