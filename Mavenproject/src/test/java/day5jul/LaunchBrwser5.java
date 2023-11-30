package day5jul;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrwser5 {

	static WebDriver driver;
	
	/*
	 * private static WebDriver launchbrowser(String browser) {
	 * 
	 * if(browser.equalsIgnoreCase("chrome")) driver = new ChromeDriver(); else
	 * if(browser.equalsIgnoreCase("edge")) driver = new EdgeDriver(); else throw
	 * new RuntimeException("Invalid Browser:" +browser); return driver; }
	 */
	  
	private static WebDriver decidebrowser(String Browser) {
		switch(Browser.toUpperCase())
		 {
		 case "CHROME":
			 driver = LaunchBrowser(BrowserType.CHROME);
			 break;
		 case "EDGE":
			 driver = LaunchBrowser(BrowserType.EDGE); 
			 break;
			 
		 }
		return driver;
	}

	private static WebDriver LaunchBrowser(BrowserType Browser) {
		if(Browser == BrowserType.EDGE)
			 driver = new EdgeDriver();
		 else if(Browser == BrowserType.CHROME)
			 driver = new ChromeDriver();
		 else
			 throw new RuntimeException("Invalid Browser:" +Browser);
		return driver;
	}
	  
	private static Properties ReadProperty() throws FileNotFoundException, IOException {
		String Filename =System.getProperty("user.dir")+ "/src/test/java/day5jul/config.properties"; 
		FileInputStream fis = new FileInputStream(Filename);
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	

	
	public static void main(String[] args) throws IOException
	{
		
		
		  //String browser = "edge";
		  //BrowserType browser;
		  
		// driver = LaunchBrowser(Browser);
	
		
		 
		 
		  
		 // driver =launchbrowser(browser);
		 
		
		Properties prop = ReadProperty();
		String Browser = prop.getProperty("Browser");
		String url = prop.getProperty("url");
		
		 
	     driver =  decidebrowser(Browser);
		
		driver.get("url");
		driver.manage().window().maximize();
		
		System.out.println("Title:" +driver.getTitle());
		System.out.println("URL:" +driver.getCurrentUrl());
		
		driver.close();
		
		
	
		
		
			
	}

	
	




}
