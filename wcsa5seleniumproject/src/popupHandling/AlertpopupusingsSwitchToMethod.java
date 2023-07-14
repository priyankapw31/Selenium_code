package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopupusingsSwitchToMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Usersa/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/Alert_popup.html");
		//generate alert popup
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//handle by using switchTo method
		Alert al = driver.switchTo().alert();
		al.accept();

	}

}
