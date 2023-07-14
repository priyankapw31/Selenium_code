package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		//explicit typecasting to javascriptexecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down operation
		jse.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		//scroll up operation
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
	
		driver.quit();
	}

}
