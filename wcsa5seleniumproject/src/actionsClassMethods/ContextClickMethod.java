package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/edgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/wcsa5workspace/wcsa5seleniumproject/MultiSelectDropdown.html");
		
		WebElement target=driver.findElement(By.id("menu"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(target).perform();
    
	}

}
