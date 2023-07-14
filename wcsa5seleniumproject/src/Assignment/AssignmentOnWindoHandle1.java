package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWindoHandle1 {
      //close the browser without using quit()
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		WebElement drop = driver.findElement(By.partialLinkText("Open a popup window"));
		Point loc = drop.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		//to perform scrolling action 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-100)+")");
	    drop.click();
	    Thread.sleep(2000);
		
	    Set<String> alladdress = driver.getWindowHandles();
	    
	    for(String wh:alladdress)
	    {
	    	driver.switchTo().window(wh).close();
	    }
		

	}

}
