package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantamonicaLinkcount {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get ("https://santamonicaedu.in/");
	}
	@Test
	public void Linkcount()
	{
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links=" +links.size());
		for(WebElement element:links)
				
				{
			String link=element.getAttribute("href");
		verify(link);
		
		}
	}
		
	private void verify(String link) {
		//Response code Method
				try
				{
			URL u=new URL (link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			System.out.println(code); 
			if(code==404)
			{
					
			System.out.println("Broken link is ----------"+link);
			}
			else
			{
				System.out.println("Successful link is ------------"+link);
			}
			
				}

			
			catch(Exception e)
				{
	}}}
	


		
				
				

	