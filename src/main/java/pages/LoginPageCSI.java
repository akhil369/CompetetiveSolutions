
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageCSI {
	public WebDriver driver;
	public LoginPageCSI(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='Sign in With Visuant']") WebElement signInWithVisuantLink;
	@FindBy(xpath="//input[@formcontrolname='email']") WebElement loginPageCheck;
	@FindBy(xpath="//input[@placeholder='Username']") WebElement userNameTextField;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement passwordTextField;
	@FindBy(xpath=" //button[text()=' Login ']") WebElement loginButtonClick;
	@FindBy(xpath="//img[@class='img-fluid']") WebElement homePageCheck;
	
	

}
