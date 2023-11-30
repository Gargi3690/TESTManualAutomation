package day11jul23;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomDemo {

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		
		Random random = new Random();
		
		int val,SrNO=0;
		for(int i=0;i<=10;i++)
		{
			val =random.nextInt(10);
			SrNO++;
			System.out.println(SrNO + ":" + "Random number:" +val);
			
			Thread.sleep(3000l);
			
			System.out.println("Gouri_" +System.currentTimeMillis());
		}
	}
}
