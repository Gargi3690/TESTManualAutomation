package day17jul23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.Select;

public class LinkDemo1 {
	
	
	static WebElement box;
	//static WebDriver driver;
	
	
	private static void Box(WebElement box) {
		List<WebElement> low = box.findElements(By.tagName("a"));
		System.out.println("Size:" +low.size());
		int cnt =1;
		for(int i=0;i<low.size();i++)
		{
			System.out.println(cnt++ + ":"   + low.get(i).getText());
			//String href = low.get(i).getAttribute("href");
			//low.get(i).click();
			/*
			 * String cURL = driver.getCurrentUrl(); if(href.equals(cURL))
			 * System.out.println("Link is not Broken"); else
			 * System.out.println("Link is Broken" );
			 */
		}
		System.out.println();

		
	}	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dista.ai/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));

		WebElement pro = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Products']")));

		Actions action = new Actions(driver);
		action.moveToElement(pro).build().perform();

		wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement pro1 =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Doorstep Services']")));
		pro1.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		
		
		 Box(driver.findElement(By.xpath("(//div/ul[@class='elementor-icon-list-items'])[1]")));
		 Thread.sleep(3000);
		 Box(driver.findElement(By.xpath("(//div/ul[@class='elementor-icon-list-items'])[2]")));
		 
		 Thread.sleep(3000);
		 Box(driver.findElement(By.xpath("(//div/ul[@class='elementor-icon-list-items'])[3]")));
		 
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,-7000)", "");
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		
		
		/*
		 * WebElement mouseOver = driver.findElement( By.xpath(
		 * "//*[@id=\"menu-item-25\"]/div/div/section/div/div[2]/div/div[1]/div/div/div/a/h2"
		 * )); action.moveToElement(mouseOver).perform();
		 * 
		 * 
		 * Thread.sleep(3000); WebElement mouseOver = driver.findElement(By.xpath(
		 * "(//*[@id=\"menu-main-menu-1\"]/li[2]/div/div/section/div/div[3]/div/div[2]/div/div/div/div[4]/a/div/span/span)[2]"
		 * ));
		 * 
		 * action.moveToElement(mouseOver).click().perform();
		 * 
		 * 
		 * Select select = new Select(dropDownlist);
		 * select.selectByVisibleText("Doorstep Services"); WebElement element =
		 * select.getFirstSelectedOption(); System.out.println("Text is :" +element);
		 * 
		 * 
		 * // div[@id='ekit-megamenu-main-menu'])[3]//ul//li[2]
		 */
	}
}
