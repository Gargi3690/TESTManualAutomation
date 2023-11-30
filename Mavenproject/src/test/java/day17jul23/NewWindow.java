package day17jul23;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		
		//driver.quit();
		
		//driver.close();
		
		Set<String> window =driver.getWindowHandles();
		Iterator<String> iter = window.iterator(); 
		String FirstWindow = iter.next();
		String SecondWindow = iter.next();
		System.out.println("FirstWindow: " +FirstWindow);
		System.out.println("SecondWindow: " +SecondWindow);
		
		driver.switchTo().window(SecondWindow);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(FirstWindow);
		driver.close();
		
		
		
	}
}
