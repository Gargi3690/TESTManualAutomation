package day4Aug23;

import org.testng.annotations.Test;

public class HelpingAttributes2 {

	@Test(priority=3)
	public void Ajio()
	{
		System.out.println("Welcome to Ajio");
	}
	
	@Test(priority=1)
	public void Flipcart()
	{
		System.out.println("Welcome to Flipcart!!!!");
	}
}
