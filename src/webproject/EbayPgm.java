package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayPgm {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/b/Art/550/bn_1853728");
	}
	@Test
	public void EbayPgm() {
		driver.findElement(By.xpath("//*[@id='gh-search-wrap']")).click();
			}

}