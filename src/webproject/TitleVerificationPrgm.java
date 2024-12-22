package webproject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationPrgm {
	ChromeDriver driver;
	
	@Before
	public void Setup()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}

@Test
public void titleVerification()
{
	String title=driver.getTitle();
	System.out.println("The page Title="+title);
	
	String k="facebook";
	if(k==title)
	{
		System.out.println("Title are same");
	}
	else
	{
		System.out.println("Not same");
}
	
		
	}

@After
public void teamDown()
{
	driver.quit();
}

}
