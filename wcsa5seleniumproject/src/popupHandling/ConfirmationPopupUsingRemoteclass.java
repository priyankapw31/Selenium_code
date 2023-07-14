package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopupUsingRemoteclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/Confirmation_popup.html");
        Thread.sleep(2000);
		//generate confirmation popup
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(2000);
		//handle popup by switchTo method
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
