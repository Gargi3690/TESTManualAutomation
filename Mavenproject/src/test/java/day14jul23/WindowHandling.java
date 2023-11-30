package day14jul23;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandling {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	    driver.findElement(By.id("openwindow")).click();
	    
	    Set<String> windIds = driver.getWindowHandles();
	    Iterator<String> iter = windIds.iterator();
	    String pWind = iter.next();
	    String cWind = iter.next();
	    
	    System.out.println("PWIND:" +pWind);
	    System.out.println("CWIND:" +cWind);
	    
	    driver.switchTo().window(cWind);
	    System.out.println("\nCurrentUrl:" +driver.getCurrentUrl());
	    System.out.println("Title:" +driver.getTitle());
	    
	    driver.close();
	    
	    driver.switchTo().window(pWind);
	    System.out.println("\nCurrentUrl:" +driver.getCurrentUrl());
	    System.out.println("Title:" +driver.getTitle());
	    
	    
	    
	}
}
