package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceprgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void pageSource()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Content present");
		}
		else
		{
			System.out.println("Content not present");
		}
	}
	
}
