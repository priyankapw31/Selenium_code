package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 		WebDriver driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/username.html");
 		WebElement usn=driver.findElement(By.tagName("input"));
 		usn.sendKeys("qspiders");
	}
}
