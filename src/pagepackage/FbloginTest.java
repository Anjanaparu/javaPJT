package pagepackage;

//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingpackage.BaseclassFb;

public class FbloginTest extends BaseclassFb {
	//public static WebDriver driver;
	//@BeforeTest
	//public void setUp() {
		//driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//}
	@Test
	public void testLogin() {
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("abc@yopmail.com", "ababacdcd");
		ob.login();
		
		
		
	}

}
