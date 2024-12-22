package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffmailPgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?ForName=user_details");
	}
	@Test
	public void rediffMailpgm()
	{
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select dayDetails=new Select(day);
		dayDetails.selectByValue("06");
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthDetails=new Select(month);
		monthDetails.selectByVisibleText("JUN");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yearDetails=new Select(year);
		yearDetails.selectByValue("1986");


	}

}
