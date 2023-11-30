package deay4jul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioUtility {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		
		
		clickOnRadioButton(By.id("bmwradio"),driver);
		Thread.sleep(2000);
		clickOnRadioButton(By.id("benzradio"),driver);
		Thread.sleep(2000);
		clickOnRadioButton(By.id("hondaradio"),driver);
		
		driver.close();
	}
	

	private static void clickOnRadioButton(By by, WebDriver driver) {
		// TODO Auto-generated method stub
		   driver.findElement(by).click();
			
	}
	
}
