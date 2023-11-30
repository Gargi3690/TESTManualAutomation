package day14jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SliderDemo {

	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&p%5B%5D=facets.price_range.from%3D30000&p%5B%5D=facets.price_range.to%3DMax");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement slide = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slide, 0, 80).build().perform();
		
		
		
		
		
		
	}
}
