package popupHandling;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Notification_popup {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser name");
		 String browservalue = sc.next();
		 
		 if(browservalue.equalsIgnoreCase("chrome"))
		 {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJuJ4boNBxaHGbev-FAxPwi5NkNL355IBnb0gcW3GxI6x7XGnFZTe5AaAkOeEALw_wcB");
		
		 }
		 else if(browservalue.equalsIgnoreCase("msedge"))
		 {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disable-notifications");
		driver= new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJuJ4boNBxaHGbev-FAxPwi5NkNL355IBnb0gcW3GxI6x7XGnFZTe5AaAkOeEALw_wcB");
		
		 }
		 else if(browservalue.equalsIgnoreCase("firefox"))
		 {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--disable-notifications");
		driver= new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJuJ4boNBxaHGbev-FAxPwi5NkNL355IBnb0gcW3GxI6x7XGnFZTe5AaAkOeEALw_wcB");
		
		 }
		 else {
			 System.out.println("not valid name");
		 }
		 sc.close();
	}

	
}
