package deay4jul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowser3 {
	
	static WebDriver driver;
	private static WebDriver launchbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
				driver = new EdgeDriver();
		else
			throw new RuntimeException("Invalid Browser: " +browser);
		return driver;
	}

	public static void main(String[] args) throws InterruptedException
	{
		String browser = "chrome";
		
		

		driver = launchbrowser(browser);
		
		
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		System.out.println("Title: " +driver.getTitle());
		System.out.println("URL :" +driver.getCurrentUrl());
		
		driver.close();
		
		
	}





}
