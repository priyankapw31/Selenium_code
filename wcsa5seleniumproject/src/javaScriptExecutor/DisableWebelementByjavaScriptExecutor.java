package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebelementByjavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/disabled.html");
		
		///explicit Typecasting to javaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("priya");
		
		//disable webelement
		jse.executeScript("document.getElementById('i2').value='pawar';");
		Thread.sleep(2000);
		
		driver.quit();
	


	}

}
