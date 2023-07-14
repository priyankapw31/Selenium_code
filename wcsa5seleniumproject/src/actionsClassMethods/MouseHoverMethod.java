package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(1000);
		WebElement target =driver.findElement(By.xpath("//a[text()='Coins ']"));
		
		//to perform action mousehover action on webelement
		Actions act=new Actions(driver);
		
		//to perform mousehover action
		act.moveToElement(target).perform();
		
        //click on 1gram 
		driver.findElement(By.xpath("(//span[text()='1 gram'])[1]"));
		
		//verify 1gm is display or not
		 WebElement usnTB = driver.findElement(By.id("5920"));
		 if (usnTB.isDisplayed()) 
		 {
			Thread.sleep(2000);
			driver.quit();
		}
		 else
		 {
			 System.out.println("Exception!!!");
				
		 }
		 
		
	}

}
