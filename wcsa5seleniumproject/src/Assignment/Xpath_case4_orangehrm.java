package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_case4_orangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[contains(@name,'Full')]")).sendKeys("priyanka");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[contains(@name,'mai')]")).sendKeys("priyankapw31@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[contains(@placeholder,'Phone Number*')]")).sendKeys("7057704950");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[contains(@name,'action')]")).click();

	}

}
