package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usingimplicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait provide
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(15)); 
		
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[text()='x'")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Login']")));
		

	}

}
