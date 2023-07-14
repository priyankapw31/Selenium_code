package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify_loginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?continue=https");
		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("priyankapw31@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("$PRIYa2022",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		

	}

}
