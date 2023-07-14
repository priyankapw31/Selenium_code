package methodsWebEelment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/115");
		driver.findElement(By.id("Check Delivery")).sendKeys("223140");
		boolean checkButton=driver.findElement(By.id("Check")).isEnabled();	
		System.out.println(checkButton);
		
	}
}
