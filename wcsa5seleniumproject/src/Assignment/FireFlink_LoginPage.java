package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlink_LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(2000);
		driver.findElement(By.id("mui-1")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("priyankapw31@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("mui-2")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Password@123",Keys.ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.id("primary-btn")).click();

	}

}
