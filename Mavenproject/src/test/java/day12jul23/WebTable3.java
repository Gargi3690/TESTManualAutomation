package day12jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	
	
	public static void main(String[] args)
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.letskodeit.com/practice");
		 driver.manage().window().maximize();
		 
		 String part1 = "//table[@name='courses']/tbody/tr[";
		 
		 String part2 ="]/td[";
		 
		 String part3 ="]";
		 
		 String txt ="";
		 
		 String bookname ="JavaScript Programming Language";
		 
		 boolean flag = false;
		 
		 for(int row =2;row<=4;row++)
		 {
			 for(int col = 1;col<=3;col++ )
			 {
				 
				txt = driver.findElement(By.xpath(part1 + row + part2 + col + part3)).getText();
			    if(txt.equalsIgnoreCase(bookname))
			    {	
			    	String price = driver.findElement(By.xpath(part1 + row + part2 + (col+1) + part3)).getText();
			    	
			    	System.out.println("Price :" +price);
			    	
			    	flag = true;
			    	break;
			    }
					
				System.out.println(txt +"\t");
			 }
			 if(flag)
				 break;
			 System.out.println();
		 }
		 
		 if(flag == false)
			 System.out.println(bookname +"is not found");
		 driver.close();
	}
}