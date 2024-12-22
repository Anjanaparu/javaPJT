package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySite {
	ChromeDriver driver;
	String T=null;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String T=driver.getTitle();
	}
	@Test
	public void ebayTest() {
		String s="Ebay.com";
		if(s.equals(T))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
		String page=driver.getPageSource();
		if(page.contains("SHOP CATEGORY"))
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("not contains");
		}
		
		//art NfTs
		
		//cart
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.id("gh-ac")).sendKeys("books",Keys.ENTER);
		}

			
			
		
		
	

}
