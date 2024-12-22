package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsite {
	ChromeDriver driver;
	@Before
	public void getUrl()
	{
		driver=new ChromeDriver();
		driver.get("https.//www.amazon.in/");
	}
	@Test
	public void LocatorsPage()
	{
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']")).click();
			
		
	}
}
		
	
	


