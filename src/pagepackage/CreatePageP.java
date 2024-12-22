package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreatePageP {
	WebDriver driver;
	@FindBy(linkText="Create a page")
	WebElement CreateAPage;
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signUp;
	
	public CreatePageP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createPageClick() {
		CreateAPage.click();
	}
	public void titleVerification() {
		String actualTitle=driver.getTitle();
		Assert.assertEquals("Facebook", actualTitle);
	}
public void signUpbutton() {
	signUp.click();}
}
	
