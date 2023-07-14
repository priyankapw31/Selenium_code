package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicates {

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
		
		HashSet<String> hs = new HashSet<String>();
		
		//to get options from dropdowns
		List<WebElement> allopts = sel.getOptions();
		
		//to read options from dropdown
		for (int i = 0; i < allopts.size(); i++)
		{
			//get text of web element
			String value = allopts.get(i).getText();
			
			//add text into set means duplicate will not be allowed
			//insertion order wont be mentioned
			hs.add(value);
		}
		
		//read the value from set
		for (String element : hs) 
		{
			Thread.sleep(2000);
			System.out.println(element);
		}

	}

}
