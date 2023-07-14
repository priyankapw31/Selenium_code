package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingExplicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		driver.get("http://desktop-p0keom8/login.do");
		String actualTitleOfLoginPage= driver.getTitle();
		if (actualTitleOfLoginPage.equals("actiTIME-Login")) 
		{
			System.out.println("testcase pass");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}
		else 
		{
			System.out.println("testcase fail");	
		}
		
		String actualTitleOfHomePage= driver.getTitle();
		if (actualTitleOfHomePage.equals("actiTIME")) 
		{
			System.out.println("testcase pass");
			driver.findElement(By.className("logout")).click();
			
		}
		
		

	}

}

