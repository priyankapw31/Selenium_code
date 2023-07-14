package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("priyankapw31@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("priya123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
              
	}

}
