package deay4jul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioutility2 {
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

	 static void clickOnRadioButton( By by) {
		driver.findElement(by).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
