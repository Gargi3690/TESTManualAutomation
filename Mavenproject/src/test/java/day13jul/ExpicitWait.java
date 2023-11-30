package day13jul;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.className("gLFyf")).sendKeys("facebook");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		WebElement element =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='facebook'])[1]")));
		
		String txt = element.getText();
		System.out.println("Text :" +txt);
	}
}
