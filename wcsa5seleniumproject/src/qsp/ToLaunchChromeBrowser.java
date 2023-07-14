package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("which browser we want to open ");
		String browservalue = sc.next();
		if (browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();// max the browser
			Thread.sleep(2000);// give the delay
			driver.close();// close the browser
		} else if (browservalue.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		} else if (browservalue.equalsIgnoreCase("gecko"));
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();

		}
		sc.close();
	}

}
