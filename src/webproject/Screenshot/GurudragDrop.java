package webproject.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GurudragDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void gurudragDrop() {
		Actions act=new Actions(driver);
    WebElement AmountSrc=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
    WebElement AmountDest=driver.findElement(By.xpath("//*[@id=\"amt7\"]/1i"));
    WebElement BankSrc=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
    WebElement BankDest=driver.findElement(By.xpath("//*[id=\"bank\"]/li"));
    act.dragAndDrop(BankSrc, BankDest);
    act.dragAndDrop(AmountDest, AmountSrc);
    act.perform();
}
}