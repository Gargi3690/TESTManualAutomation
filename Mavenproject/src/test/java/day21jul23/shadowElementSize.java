package day21jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class shadowElementSize {

	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		WebElement element2 =driver.findElement(By.xpath("(//p/img)[1]"));
		System.out.println("getRect.getDimension.getHeight:" +element2.getRect().getDimension().getHeight());
		
		System.out.println("getRect.getDimension.getWidth:" +element2.getRect().getDimension().getWidth());
		
		System.out.println("getRect.getDimension.Height:" +element2.getRect().getDimension().height);
		
		System.out.println("getRect.getDimension.Width:" +element2.getRect().getDimension().width);
		
		
		System.out.println("getRect.getHeight:" +element2.getRect().getHeight());
		
		System.out.println("getRect.getWidth:" +element2.getRect().getWidth());
		
		
		System.out.println("getRect.Height :" +element2.getRect().height);
		System.out.println("getRect.Width :" +element2.getRect().width);
		
		
		WebElement element1 = driver.findElement(By.xpath("(//p/img)[2]"));
		
System.out.println("getRect.getDimension.getHeight:" +element1.getRect().getDimension().getHeight());
		
		System.out.println("getRect.getDimension.getWidth:" +element1.getRect().getDimension().getWidth());
		
		System.out.println("getRect.getDimension.Height:" +element1.getRect().getDimension().height);
		
		System.out.println("getRect.getDimension.Width:" +element1.getRect().getDimension().width);
		
		
		System.out.println("getRect.getHeight:" +element1.getRect().getHeight());
		
		System.out.println("getRect.getWidth:" +element1.getRect().getWidth());
		
		
		System.out.println("getRect.Height :" +element1.getRect().height);
		System.out.println("getRect.Width :" +element1.getRect().width);
		
		
		
		
	}
	
}
