package pagepackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpasswrd=By.id("pass");
	By fbloginbutton=By.name("login");
	//@FindBy(id="email")
	//WebElement fbemail;
	//@FindBy(name="login")
	//WebElement passwrd;
	//@FindBy(name="login")
	//WebElement fbloginbutton;
	
	public Fbloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues(String email,String password) {
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpasswrd).sendKeys(password);
		//fbemail.sendKeys(email);
		//passwrd.sendKeys(password);
	}
			public void login() {
				driver.findElement(fbloginbutton).click();
		//fbloginbutton.click();
	}

}
