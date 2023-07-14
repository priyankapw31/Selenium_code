package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllselectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/MultiSelectDropdown.html");
        WebElement singleSelectDD = driver.findElement(By.id("menu"));
        Select sel = new Select(singleSelectDD);
        Thread.sleep(2000);
        for (int i = 0; i <=3; i++) 
        {
        	Thread.sleep(2000);
        	sel.selectByIndex(i);
		}
        
        List<WebElement> option = sel.getAllSelectedOptions();
        for (WebElement opt : option) 
        {
        	Thread.sleep(2000);
			System.out.println(opt.getText());
		}

	}

}
