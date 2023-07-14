package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentjavaScriptExecutorSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//h2[text()='News']"));
		//Point loc = target.getLocation();
		//int xaxis = loc.getX();
		//int yaxis = loc.getY();
		driver.findElement(By.xpath("//h2[text()='News']"));
		Thread.sleep(2000);
		//typecasting to javascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollby("+xaxis+","+yaxis+")");
		jse.executeScript("arguments[0].scrollIntoView(false)",target);

	}

}
