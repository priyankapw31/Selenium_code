package testNGAdvantage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


public class BaseTest implements IautoConstant{

		//it is use to open & close the browser
				static WebDriver driver;
				public void setUp() throws IOException
				{
					Flib flib = new Flib();
					String browserValue = flib.readPropertyData(Property_path, "Browser");
					String url = flib.readPropertyData(Property_path, "Url");
					
					if(browserValue.equalsIgnoreCase("chrome"))
					{
						System.setProperty(chrome_key, chrome_value);
						driver=new org.openqa.selenium.chrome.ChromeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						driver.get(url);
					}
					
					else if(browserValue.equalsIgnoreCase("Firefox"))
					{
						System.setProperty( firefox_key,  firefox_value);
						driver=new org.openqa.selenium.firefox.FirefoxDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						driver.get(url);
					}
					
					else if(browserValue.equalsIgnoreCase("Edge"))
					{
						System.setProperty( edge_key,  edge_value);
						driver=new org.openqa.selenium.edge.EdgeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						driver.get(url);
					}
					
				}
				public void failedMethod(String methodName)
				{
					 TakesScreenshot ts = (TakesScreenshot)driver;
					 File src = ts.getScreenshotAs(OutputType.FILE);
					 File dest = new File("./screenshots"+methodName+".png");
					 try {
						Files.copy(src, dest);
					  } 
					 catch (Exception e)
					 {
						
					 }
				}
				
				public void tearDown()
				{
					driver.quit();
				}

				
			}
	


