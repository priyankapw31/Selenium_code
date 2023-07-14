package methodsWebEelment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Dimension newsElement=driver.findElement(By.name("username")).getSize();
		int height=newsElement.getHeight();
		int width=newsElement.getWidth();
		System.out.println(height+" "+width);
		
	}

}
