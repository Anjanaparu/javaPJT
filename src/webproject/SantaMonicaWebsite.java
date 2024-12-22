package webproject;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantaMonicaWebsite {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
			     driver = new ChromeDriver();
			     driver.get("https://santamonicaedu.in/");
			     driver.manage().window().maximize();
	}
		@Test
		public void testVerification () {
			String actualtitle=driver.getTitle();
			System.out.println(actualtitle);
			String given ="Santamonica Study Abroad Pvt.ltd";
			if(actualtitle.equals(given)) {
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
			String page=driver.getPageSource();
			if(page.contains("Contact Us"))
			{
				System.out.println("contains");
			}
			else
			{
			System.out.println("not contains");
			}
			driver.findElement(By.xpath("//*[@id='menu-item-567']/a")).click();
			driver.findElement(By.name("cname")).sendKeys("abcd");
			driver.findElement(By.name("cemail")).sendKeys("abc@123");
			}
			
			
		}
	


