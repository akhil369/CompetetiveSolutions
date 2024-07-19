package testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginPage extends Base {
	@Test(priority = 4)
	public void verifyUserIsAbleToLoginWithValidUsernameAndValidPassword()
	{
		
		WebElement loginPageCheck=driver.findElement(By.xpath("//span[text()='Sign in With Visuant']//ancestor::div[@class='h-screen flex']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(loginPageCheck).build().perform();
		boolean actualPage=loginPageCheck.isDisplayed();
		assertTrue(actualPage,"User is unable to see the login page");
		
		String userNameValue="userakhil";
		WebElement userNameTextField=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userNameTextField.sendKeys(userNameValue);
		String userNameCheck=userNameTextField.getText();
		
		
		
		
		String passwordValue="Apple@123#";
		WebElement passwordTextField=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordTextField.sendKeys(passwordValue);
		String passwordCheck=passwordTextField.getText();
		  
		
		WebElement loginButton=driver.findElement(By.xpath("//button[text()=' Login ']"));
		loginButton.click();
		
		WebElement homePageCheck=driver.findElement(By.xpath("//a[@class='s-sidebar__nav-link -active']//parent::li[@class=\"ng-star-inserted\"]"));
		boolean homePage=homePageCheck.isDisplayed();
		assertTrue(homePage,"User is unable to login even if the username and password is incorrect");
		
	}
	
	
	}
	
	





