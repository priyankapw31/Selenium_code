package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_spicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/profile/sign-i");
		driver.findElement(By.xpath("div[text()='Login']")).click();
		driver.findElement(By.xpath("input[@type='number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass123");

	}

}
