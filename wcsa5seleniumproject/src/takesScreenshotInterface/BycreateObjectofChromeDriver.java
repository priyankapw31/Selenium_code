package takesScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BycreateObjectofChromeDriver {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver crmdriver = new ChromeDriver();
		
		crmdriver.manage().window().maximize();
		crmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		crmdriver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		
		File src = crmdriver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/selenium.png");
		
		Files.copy(src, dest);

	}

}
