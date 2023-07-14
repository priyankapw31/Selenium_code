package dropdownHandling;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/MultiSelectDropdown.html");
        WebElement singleSelectDD = driver.findElement(By.id("menu"));
        Select sel = new Select(singleSelectDD);
        Thread.sleep(2000);
        List<WebElement> dropdown = sel.getOptions();
        for (int i = 0; i <dropdown.size(); i++) 
        {
			String options = dropdown.get(i).getText();
			System.out.println(options);
			Thread.sleep(2000);
		}

	}

}
