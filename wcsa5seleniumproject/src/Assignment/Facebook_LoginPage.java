package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("komalpw31@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Pass@123",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();


	}

}
