package testNG;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method3() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https:/www.google.com");
		 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		 Thread.sleep(2000);
		 driver.quit();
		 
		 System.out.println("this is sumo test ng class");
  }
}
