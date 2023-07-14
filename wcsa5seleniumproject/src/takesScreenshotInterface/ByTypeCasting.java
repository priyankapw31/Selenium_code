package takesScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByTypeCasting {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		//type casting to TakesSceenshot(i)
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		File src = tss.getScreenshotAs(OutputType.FILE); 
		
		File target = new File("./screenshots/Google.png");
		
		//copy and paste into files class
		Files.copy(src, target);

	}

}
