package qsp;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class managemethodtosetposition {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Point p = new Point(500,400);
		driver.manage().window().setPosition(p);
		

	}

}
