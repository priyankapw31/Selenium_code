package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		String address = driver.getWindowHandle();
		System.out.println("address of parent window:"+address);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> add = driver.getWindowHandles();
		System.out.println(add);

	}

}
