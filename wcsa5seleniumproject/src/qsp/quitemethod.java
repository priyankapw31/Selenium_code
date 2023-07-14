package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitemethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.comm/");
		//click on link for child browser
		driver.findElement(By.xpath("//a[text()='open a popup window']")).click();
		//click on link for the child browser
		driver.quit();
		 
	}

}
