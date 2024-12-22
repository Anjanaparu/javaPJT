package webproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScriptpgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String title=driver.getTitle();
		System.out.println("the page title:"+title);
		String exp="facebook";
		if(exp.equals("the page title"))
		{
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("not same");
		}

								
	}

}
