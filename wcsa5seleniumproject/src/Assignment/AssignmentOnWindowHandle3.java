package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("field-keywords")).sendKeys("samsung mobile");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy M14 5G (Smoky Teal, 4GB, 128GB Storage) | 50MP Triple Cam | 6000…']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}

}
