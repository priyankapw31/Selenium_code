package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignmentBluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("//div[@id='chat-icon']")).click();
		Thread.sleep(2000);
		//identify frame by using xpath
		WebElement frameelement = driver.findElement(By.id("//iFrame[@id='fc_widget']"));
		//handle the frame by switch to control frame using string id
		driver.switchTo().frame(frameelement);
		Thread.sleep(2000);
		//by explict wait click on element
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("//div[@id='chat-icon']"))).click();
		
		//click on web element
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);
		//switch the control again back to the main webpage by using defaultcontent method
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-namev")).sendKeys("priya");
		driver.findElement(By.id("chat-fc-email")).sendKeys("priyank@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		driver.findElement(By.id("//a[text()='Start Chat']")).click();
		

	}

}
