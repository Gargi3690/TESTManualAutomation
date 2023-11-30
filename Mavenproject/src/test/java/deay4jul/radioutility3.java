package deay4jul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioutility3 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		clickOnRadioButton(By.id("bmwradio"));
		clickOnRadioButton(By.id("benzradio"));
		clickOnRadioButton(By.id("hondaradio"));
		
		
	}

	 static void clickOnRadioButton( By by) throws InterruptedException {
		driver.findElement(by).click();
		Thread.sleep(2000);
	}
}
