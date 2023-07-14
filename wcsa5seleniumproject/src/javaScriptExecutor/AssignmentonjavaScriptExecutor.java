package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentonjavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.puma.com/in/en/mens/mens-shoes?utm_source=GGL-SEA&utm_medium=PS&utm_aud=OTH&utm_obj=OLC&utm_campaign=PS_GGL_IN_PS_GGL_SEA_TXT_Brand_Category_FTW_agency_1000067495857508873&gclid=CjwKCAjwv8qkBhAnEiwAkY-ahudYNWpctQqoOcXRNyztEht-chVvaUivSbZuPCkUl0PsvKv1dwy2ABoCkQAQAvD_BwE");
		
		///explicit Typecasting to javaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		Point news = driver.findElement(By.xpath("//h3[contains(@class,'w-')]/descendant::span[text()='PUMA Black-Asphalt']")).getLocation();
		int xaxis=news.getX();
		int yaxis = news.getY();
		
		jse.executeScript("window.scrollby("+xaxis+","+yaxis+")");

	}

}
