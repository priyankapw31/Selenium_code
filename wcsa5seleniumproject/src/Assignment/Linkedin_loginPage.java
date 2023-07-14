package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin_loginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/home");
		Thread.sleep(2000);
		driver.findElement(By.id("session_key")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("priyankapw31@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("session_password")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("$PRIYa2022",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("sign-in-form__submit-btn")).click();
		
		

	}

}
