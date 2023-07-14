package actionsClassMethods;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//lunch the actitime
		
		driver.get("http://desktop-p0keom8/login.do");

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.name("loginbutton")).click();
        //home page
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
        
        //click on settings module
        driver.findElement(By.xpath("(//div[text()='Settings']/ancestor::a)"));
        
        //click on logo and color
        driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']"));
        Thread.sleep(2000);
        
        //click on use custom logo
        driver.findElement(By.id("uploadNewLogoOption")).click();
        
        //perform double click
        WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    
       Actions act = new Actions(driver);
       act.doubleClick(target).perform();
       
       Thread.sleep(2000);
       Runtime.getRuntime().exec("./autoitPrograms/Fileupload.exe");
	}

}
