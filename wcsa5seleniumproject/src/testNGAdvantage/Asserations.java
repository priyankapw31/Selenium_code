package testNGAdvantage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Asserations {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-p0keom8/login.do");
	  String actualTitle = driver.getTitle();
	  //used soft assert for login page validate
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(), actualTitle);
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manger");
	  driver.findElement(By.id("loginButton")).click();
	  System.out.println("title matched test case passed!!");
	  sa.assertAll();
	  
	  //hard assert used for home page
	  String actualTitleOfHomePage = driver.getTitle();
	  Assert.assertEquals(driver.getTitle(), actualTitleOfHomePage);
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Logout")).click();

	}

}
