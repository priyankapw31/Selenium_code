package robotAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot4AndActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//actions class
		Actions act = new Actions(driver);
		//move to watch jewellery tag
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		//click on band options
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(2000);
		//click and hold the filter by
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		for(int i=1;i<=2;i++)
		{
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
		}
		
		Thread.sleep(4000);
		//robot class
		Robot robot = new Robot();
		
		//copy the text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		if (driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed()) 
		{
		  Thread.sleep(2000);	
		  driver.quit();
		}
		else
		{
			System.out.println("Exception!!");
		}
	}

}
