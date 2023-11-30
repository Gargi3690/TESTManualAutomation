package deay4jul;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchbrowser4 {

	
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
	private static Properties RedaProperty() throws FileNotFoundException, IOException {
		String filename = System.getProperty("user.dir") +"/src/test/java/deay4jul/config.properties";
		FileInputStream fis = new FileInputStream(filename);
		
		
        Properties prop = new Properties();
        prop.load(fis);
		return prop;
	}
	

	public static void main(String[] args) throws IOException
	{
		
		Properties prop = RedaProperty();
        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
		driver = launchbrowser(browser);
		
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("Title: " +driver.getTitle());
		System.out.println("URL :" +driver.getCurrentUrl());
	}

	
}
