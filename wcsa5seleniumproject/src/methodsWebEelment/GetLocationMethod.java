package methodsWebEelment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Point newsElement=driver.findElement(By.name("username")).getLocation();
		int Xaxis=newsElement.getX();
		int Yaxis=newsElement.getY();
		System.out.println("X-axis of newsElement:" +Xaxis+"Yaxis of newsElement:"+Yaxis);


	}

}
