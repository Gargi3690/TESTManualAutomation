package day30june;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumdemo {
	

	
		
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new EdgeDriver();
			
			//driver.get("https://www.amazon.in/");
			driver.navigate().to("https://www.amazon.com");
			driver.manage().window().maximize();
			
			String title =driver.getTitle();
			System.out.println("Title:" +title);
			
			String Url = driver.getCurrentUrl();
			System.out.println("Url:" +Url);
			
			String getSource =driver.getPageSource();
			System.out.println("pagesource: "+getSource);
			
			Thread.sleep(4000);
			
			//driver.close();
			
			driver.quit();
			
		}


}
