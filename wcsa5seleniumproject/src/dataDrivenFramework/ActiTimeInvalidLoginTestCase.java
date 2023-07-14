package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-p0keom8/login.do");
		
		//create object of flib(filelibrary class) 
		 Flib flib = new Flib();
		 
		 //count the last row num from flib
		 int rc = flib.getLastRowCount("./data/ActiTimeTestData.xlsx", "invalidcreads");
		 //for test multiple invaliddata use for loop
		 for(int i=1;i<=rc;i++) 
		 {
		 String validusername = flib.ReadExcelData("./data/ActiTimeTestData.xlsx", "invalidcreads", i, 0);
		 String validpassword = flib.ReadExcelData("./data/ActiTimeTestData.xlsx", "invalidcreads", i, 1);
         
		 driver.findElement(By.name("username")).sendKeys(validusername);
		 driver.findElement(By.name("pwd")).sendKeys(validpassword);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
		 
		 }

	}

}
