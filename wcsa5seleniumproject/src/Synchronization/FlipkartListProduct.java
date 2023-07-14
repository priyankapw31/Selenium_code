package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartListProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='X']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Core i5']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 10']"));
		Thread.sleep(2000);
		
		List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T"));
	   	
		List<WebElement> priceOfLaptop = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		for (int i = 0; i < laptops.size(); i++) 
		{
			String ops = laptops.get(i).getText();
			
			for (int j = i; j <=i; j++) 
			{
				String op = priceOfLaptop.get(j).getText();
				System.out.print(ops+" : "+op);
				Thread.sleep(2000);
			}
			System.out.println();
		}
	}

}
