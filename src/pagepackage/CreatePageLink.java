package pagepackage;

//import java.time.Duration;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingpackage.BaseclassFb;

public class CreatePageLink  extends BaseclassFb {
	//public static WebDriver driver;
	//@BeforeTest
	//public void setUp() {
		//driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//}
	@Test
	public void testLogin()
	{
		CreatePageP cp=new CreatePageP(driver);
		cp.createPageClick();
		cp.titleVerification();
		cp.signUpbutton();
	}

}
