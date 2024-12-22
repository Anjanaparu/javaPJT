package webproject.Screenshot;


import java.util.Set;


import org.openqa.selenium.By;
//import org.openqa.selenium.javascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonMobileSearch {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void amazonMobile()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile",Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("the page title="+title);
		String expectedTitle="Amazon.in:websites";
		if(title.equals(expectedTitle))
		{
			System.out.println("Not the Expected Title");
		}
		else {
			System.out.println("It is the expected title");
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div//span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window title:"+driver.getTitle());
		driver.findElement(By.xpath("/html/body")).click();
		
		
		Set<String>allWindows=driver.getWindowHandles();
		for(String handle:allWindows) {
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
				//javascriptExecutor js=(JavascriptExecution)driver;
				//js.executeScript("window.scrollBy(0,250)","");
				//driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("vivo");
				driver.close();
			}}
		driver.switchTo().window(parentWindow);
			}
		
			
		
		}

