package day17jul23;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindBrokenLinks {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		WebElement link = driver.findElement(By.xpath("//div[@class='dev-links']"));
		List<WebElement> low = link.findElements(By.tagName("a"));
		System.out.println("count:" +low.size());
		int cnt = 1;
		for(int i= 0;i<low.size();i++)
		{
			System.out.println(cnt++ + "" +low.get(i).getText());
			String href = low.get(i).getAttribute("href");
			low.get(i).click();
			
			String url = driver.getCurrentUrl();
			System.out.println("GetCurrentUrl:" +url);
			
			if(href.equals(url) )
				System.out.println("Link is not broken");
			else
				System.out.println("Link is broken, href :" +href + " url :" +url);
			
			driver.navigate().back();
		}
		
	}
}
