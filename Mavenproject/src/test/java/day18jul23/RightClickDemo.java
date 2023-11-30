package day18jul23;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement element = driver.findElement(By.xpath("(//p)[2]/img"));
		Actions action = new Actions(driver);
		
		action.contextClick(element).build().perform();
		
		driver.findElement(By.id("dm2m1i1tdT")).click();
		
		driver.findElement(By.id("dm2m2i2tdT")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
        Iterator<String> winId = windows.iterator();
        String pWind = winId.next();
        String cWind = winId.next();
        System.out.println("\npwind :" +pWind + "cWind :" +cWind);
        
        driver.switchTo().window(cWind);
        String actualWIndowTitle = driver.getTitle();
        System.out.println("ActualWindowTitle :" +actualWIndowTitle) ;    
        
        String WIndowTitle = "Menu Javascript Parameters - Product Info";
        if(actualWIndowTitle.equals(WIndowTitle))
        	System.out.println("Test case passed");
        else
        	System.out.println("Test case  not passed");
        
        driver.close();
        
        driver.switchTo().window(pWind);
        
        driver.close();
        }
	
	
}
