package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		///explicit Typecasting to javaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//perform scrolling right
		jse.executeScript("window.scrollby(500,0)");
		Thread.sleep(2000);
		//perform scrolling left
		jse.executeScript("window.scrollby(-500,0)");
		Thread.sleep(2000);
		
		//driver.quit();
		

	}

}
