package day17jul23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkdemo1 {
static WebElement box;
	
private static void Box(WebElement box) {
	List<WebElement> low = box.findElements(By.tagName("a"));
	System.out.println("Size:" +low.size());
	int cnt =1;
	for(int i=0;i<low.size();i++)
	{
		System.out.println(cnt++ + ":"   + low.get(i).getText());
		//String href = low.get(i).getAttribute("href");
	}
	System.out.println();

	
}	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://dista.ai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7000)", "");
		
		
	 Box(driver.findElement(By.xpath("//div[2]/div/div/section[1]/div/div[2]/div/div[1]")));
	 Thread.sleep(3000);
	 Box(driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div/div/section[1]/div/div[2]/div/div[1]")));
	 
	 Thread.sleep(3000);
	 Box(driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div/div/section[1]/div/div[3]/div/div/div")));
	 
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,-7000)", "");
	 
	 Thread.sleep(2000);
	 
	 driver.close();
		//Box(box);
		//List<WebElement> low = box1.findElements(By.tagName("a"));
		
	}

		
}
