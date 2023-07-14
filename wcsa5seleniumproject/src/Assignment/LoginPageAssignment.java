package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("priyankapw31@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("pass123");
		driver.findElement(By.xpath("//[@class='btn login-button btn-submit btn-small']")).click();
		
    }
}
