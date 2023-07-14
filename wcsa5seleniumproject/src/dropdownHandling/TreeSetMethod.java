package dropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetMethod {

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
		
		TreeSet<String> tree = new TreeSet<String>();
		
		//get options from dropdown
		List<WebElement> alloptions = sel.getOptions();
		for (int i = 0; i < alloptions.size(); i++) 
		{
			String value = alloptions.get(i).getText();
			//eliminates dublicate options
			//arrange in asending order
			tree.add(value);
		}
		
		for (String op: tree)
		{
			Thread.sleep(2000);
			System.out.println(op);
		}

	}

}
