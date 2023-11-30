package deay4jul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class llaunchbrowser {

	public static void main(String[] args)
	{
		
		String browser = "edge";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("Edge"))
			driver=new EdgeDriver();
		else 
			throw new RuntimeException("Invalid Browser:" +browser);
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		System.out.println("Title:" +driver.getTitle());
		
		System.out.println("Url:" +driver.getCurrentUrl());
	}
}
