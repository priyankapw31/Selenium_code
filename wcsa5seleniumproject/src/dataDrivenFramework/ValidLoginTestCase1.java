package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-p0keom8/login.do");
		
		//create object of flib(filelibrary class) 
		 Flib flib = new Flib();
		 
		 String validusername = flib.ReadExcelData("./data/ActiTimeTestData.xlsx", "validcreads", 1, 0);
		 String validpassword = flib.ReadExcelData("./data/ActiTimeExcelData.xlsx", "validcreads", 1, 1);
         
		 driver.findElement(By.name("username")).sendKeys(validusername);
		 driver.findElement(By.name("pwd")).sendKeys(validpassword);
		 driver.findElement(By.id("loginButton")).click();
		
	}

}
