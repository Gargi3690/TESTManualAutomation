package day21jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SVGDemo {

	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://sajithatharaka.github.io/svg-automation/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
		WebElement svgCircle = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']"));//*[local-name()='circle']
		
		System.out.println("X-coordinate :" +svgCircle.getAttribute("cx"));
		System.out.println("Y-coordinate :" +svgCircle.getAttribute("cy"));
		System.out.println("Radius :" +svgCircle.getAttribute("r"));
		System.out.println("Stroke :" +svgCircle.getAttribute("stroke"));
		System.out.println("Stroke-width :" +svgCircle.getAttribute("stroke-width"));
		System.out.println("fill :" +svgCircle.getAttribute("fill"));
		
		
		System.out.println("------------------------------------------------");
		
		
		WebElement svgRect = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='rect']"));
		
		System.out.println("Id :" +svgRect.getAttribute("id"));
		System.out.println("Width :" +svgRect.getAttribute("width"));
		System.out.println("Height :" +svgRect.getAttribute("height"));
		System.out.println("Style :" +svgRect.getAttribute("style"));
		//System.out.println("Stroke-Width :" +svgRect.getAttribute("stroke-width"));
		//System.out.println("Stroke :" +svgRect.getAttribute("stroke"));
		
		

		System.out.println("------------------------------------------------");
		
		
		WebElement svgText = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text']"));
		
		System.out.println("x-axis:" +svgText.getAttribute("x"));
		System.out.println("Y-axis:" +svgText.getAttribute("y"));
		System.out.println("fill:" +svgText.getAttribute("fill"));
		System.out.println("Text getText:" +svgText.getText());
		System.out.println("Text using TextContent:" +svgText.getAttribute("textContent"));
		System.out.println("Text using InnerHTML:" +svgText.getAttribute("innerHTML"));
		
	}
}
