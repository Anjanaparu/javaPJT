package webproject.Screenshot;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GurualertHandling {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void guruAlert()
	{
		Actions act=new Actions(driver);
		WebElement rightClick=driver.findElement(By.xpath("//*[@id='authentication']/span"));
		act.contextClick(rightClick).perform();
		
		WebElement click=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
		act.contextClick(click).perform();
		Alert a1=driver.switchTo().alert();
		a1.accept();
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id='authentication']/button"));
		act.doubleClick(doubleclick).perform();
		Alert a2=driver.switchTo().alert();
		a2.accept();

	}
	}




