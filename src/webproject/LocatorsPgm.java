package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPgm {
	ChromeDriver  driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void Locatorspg()
	{
		driver.findElement(By.name("email")).sendKeys("anjana");
		driver.findElement(By.id("pass")).sendKeys("anjana123");
		driver.findElement(By.name("login")).click();
	}

}
