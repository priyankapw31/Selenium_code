package dropdownHandling;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedhashSetMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/MultiSelectDropdown.html");
		//identify dropdown
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		
		//handle dropdown
		Select sel = new Select(dropdownElement);
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		//get options from dropdown
		List<WebElement> alloptions = sel.getOptions();
		for (int i = 0; i < alloptions.size(); i++) 
		{
			String value = alloptions.get(i).getText();
			//remove duplicates options
			//make inseration order i.e FIFO
			hs.add(value);
		}
		
		for (String op: hs)
		{
			Thread.sleep(2000);
			System.out.println(op);
		}

	}

}
