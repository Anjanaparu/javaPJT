package webproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void linkCountFb()
	{
		List<WebElement> linkDetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+linkDetails.size());
				}
	}


