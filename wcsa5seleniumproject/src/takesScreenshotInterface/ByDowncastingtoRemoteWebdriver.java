package takesScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDowncastingtoRemoteWebdriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//downcasting to RemoteWebDriver
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./screenshots/instagram.png");
		
		Files.copy(src, target);

	}

}
