package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant {

		//it is use to open & close the browser
		static WebDriver driver;
		public void openBrowser() throws IOException
		{
			Flib flib = new Flib();
			String browserValue = flib.readPropertyData(Property_path, "Browser");
			String url = flib.readPropertyData(Property_path, "Url");
			
			if(browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty(chrome_key, chrome_value);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
			}
			
			else if(browserValue.equalsIgnoreCase("Firefox"))
			{
				System.setProperty( firefox_key,  firefox_value);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
			}
			
			else if(browserValue.equalsIgnoreCase("Edge"))
			{
				System.setProperty( edge_key,  edge_value);
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
			}
			
		}
		
		public void closeBrowser()
		{
			driver.quit();
		}

	}


