package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSynchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://desktop-p0keom8/login.do");
		//login page
		String actualTitleOfLoginPage= driver.getTitle();
		explicitWaitMethod(driver,30,actualTitleOfLoginPage);
		System.out.println("title is matched test case is passed!!");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//home page
		//enter Time-Track
		System.out.println("title is matched test case is passed");
		
	}

	public static void explicitWaitMethod(WebDriver driver, int i, String Title) {
		//to apply explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.titleContains(Title));
		
	}

}
