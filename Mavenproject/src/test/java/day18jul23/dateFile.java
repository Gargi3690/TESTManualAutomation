package day18jul23;

import java.util.Date;

public class dateFile {

	
	public static void main(String[] args)
	{
		Date dt = new Date();
		System.out.println(dt);
		
		String fn = "src_" +dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(fn);
	}
}
