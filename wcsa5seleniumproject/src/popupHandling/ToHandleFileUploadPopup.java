package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://omayo.blogspot.com/");
	  Thread.sleep(2000);
	  WebElement target = driver.findElement(By.id("uploadfile"));
	  Actions act = new Actions(driver);
	  act.doubleClick(target).perform();
	  Runtime.getRuntime().exec("./autoitPrograms/OmayoFileUpload.exe");
	  Thread.sleep(2000);
	  
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyRelease(KeyEvent.VK_TAB);
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyRelease(KeyEvent.VK_TAB);
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyRelease(KeyEvent.VK_TAB);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(2000);
	  driver.quit();
	
	  
	}

}
