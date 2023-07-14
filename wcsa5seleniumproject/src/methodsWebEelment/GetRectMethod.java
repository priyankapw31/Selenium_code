package methodsWebEelment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Rectangle newsElement=driver.findElement(By.name("username")).getRect();
		int Xaxis=newsElement.getX();
		int Yaxis=newsElement.getY();
		int height=newsElement.getHeight();
		int width=newsElement.getWidth();
		System.out.println(Xaxis+" "+Yaxis+" "+height+" "+width);

	}

}
