package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/MultiSelectDropdown.html");
        WebElement singleSelectDD = driver.findElement(By.id("menu"));
        Select sel = new Select(singleSelectDD);
        Thread.sleep(2000);
        for (int i = 2; i <5 ; i++) 
        {
			sel.selectByIndex(i);
		}
        WebElement option = sel.getFirstSelectedOption();
        System.out.println("first selected option is"+ option.getText());

	}

}
