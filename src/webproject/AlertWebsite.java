package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWebsite {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANJANA%20KRISHNAN/Desktop/alert.html");
	}
	@Test
	public void alertWebsite()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Anjana");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("krishnan");
	}
	
		
	

}
