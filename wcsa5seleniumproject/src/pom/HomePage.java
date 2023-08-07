package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {     
	 //store all home page module
	@FindBy(xpath="(//div[text()='Time-Track']/../descendant::img)[1]") private WebElement timeTrackModule;
	@FindBy(xpath="//div[text()='Tasks']/following-sibling::img") private WebElement taskModule;
	@FindBy(xpath="(//td[@class='navItem relative'])[3]") private WebElement reportsModule;
	@FindBy(xpath="(//td[@class='navItem relative'])[4]") private WebElement userModule;
	@FindBy(xpath="(//td[@class='navItem relative'])[5]") private WebElement workScheduleModule;
	@FindBy(xpath="(//td[@class='navItem relative'])[6]") private WebElement settingsModule;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTaskModule() {
		return taskModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUserModule() {
		return userModule;
	}

	public WebElement getWorkSchedulemodule() {
		return workScheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	//click on all the modules 
	public void clickOnTimeTrackModule()
	{
		timeTrackModule.click();
	}
	
	public void clickOnTaskModule()
	{
		taskModule.click();
	}
	
	public void clickOnReportModule()
	{
		reportsModule.click();
	}
	
	public void clickOnUserModule()
	{
		userModule.click();
	}
	
	public void clickOnWorkSheduleModule()
	{
		workScheduleModule.click();
	}
	
	public void clickOnSettings() 
	{
		settingsModule.click();
	}
	
	public void clickOnLogoutLink()
	{
		logoutLink.click();
	}
}
