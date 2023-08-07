package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		//it is webelemnt reository
		@FindBy(xpath="//*[@name='username']") private WebElement unsTB;
		@FindBy(xpath="//*[@name='pwd']") private WebElement pswTB;
		@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement loginButton;
		
       //intialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//utilaization
		public WebElement getUnsTB() {
			return unsTB;
		}

		public WebElement getPswTB() {
			return pswTB;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		//operational method
		public void validloginMethod(String validUsername,String validPassword)
		{
			unsTB.sendKeys(validUsername);
			pswTB.sendKeys(validPassword);
			loginButton.click();
		}
		
		public void invalidloginMethod(String invalidUsername,String invalidPassword) throws InterruptedException
		{
			unsTB.sendKeys(invalidUsername);
            pswTB.sendKeys(invalidPassword);
            loginButton.click();
            Thread.sleep(1000);
            unsTB.clear();
		}
		
	}


