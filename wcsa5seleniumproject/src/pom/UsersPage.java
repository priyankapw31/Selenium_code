package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	//store webelements of userpage
	@FindBy(xpath="//input[@value='Create New User']") private WebElement userListCreateNewUserButton;
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement passTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']") private WebElement retypePassTB;
	@FindBy(name="firstName") private WebElement firstNameTB;
	@FindBy(name="lastName") private WebElement lastNameTB;
	@FindBy(name="rightGranted[12]") private WebElement modifyEnterTimeTrackCheckBox;
	@FindBy(name="rightGranted[2]") private WebElement manageCust_projectCheckBox;
	@FindBy(name="rightGranted[1]") private WebElement generateReportsCheckbox;
	@FindBy(name="rightGranted[5]") private WebElement manageuserCheckBox;
	@FindBy(name="rightGranted[7]") private WebElement manageBillingTypeCheckBox;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserButton;
	@FindBy(xpath="/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]]") private WebElement cancelButton;
	
	@FindBy(xpath="//a[.='Shrama, Rohit(manager_01)']") private WebElement usersLink;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement deleteThisUserButton;
	
	//intialization
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserListCreateNewUserButton() {
		return userListCreateNewUserButton;
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getRetypePassTB() {
		return retypePassTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyEnterTimeTrackCheckBox() {
		return modifyEnterTimeTrackCheckBox;
	}

	public WebElement getManageCust_projectCheckBox() {
		return manageCust_projectCheckBox;
	}

	public WebElement getGenerateReportsCheckbox() {
		return generateReportsCheckbox;
	}

	public WebElement getManageuserCheckBox() {
		return manageuserCheckBox;
	}

	public WebElement getManageBillingTypeCheckBox() {
		return manageBillingTypeCheckBox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getUsersLink() {
		return usersLink;
	}

	public WebElement getDeleteThisUserButton() {
		return deleteThisUserButton;
	}
	
	public void createManager(String username,String password,String fn,String ln) throws InterruptedException
	{
		userListCreateNewUserButton.click();
		Thread.sleep(2000);
		usnTB.sendKeys(username);
		passTB.sendKeys(password);
		retypePassTB.sendKeys(password);
		firstNameTB.sendKeys(fn);
		lastNameTB.sendKeys(ln);
		Thread.sleep(1000);
		modifyEnterTimeTrackCheckBox.click();
		manageCust_projectCheckBox.click();
		generateReportsCheckbox.click();
		manageuserCheckBox.click();
		manageBillingTypeCheckBox.click();
		createUserButton.click();
		
	}
	
	
}
