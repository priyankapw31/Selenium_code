package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("http://desktop-p0keom8/login.do");
     
     //read the data fro excelsheet
     //for username
     FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
     Workbook wb = WorkbookFactory.create(fis);
    Sheet sheet = wb.getSheet("validcreads");
    Row row = sheet.getRow(1);
    Cell cell = row.getCell(0);
    String userdata = cell.getStringCellValue(); //read the value fromcell
     
    //for password
    FileInputStream fis1 = new FileInputStream("./data/ActiTimeTestData.xlsx");
    Workbook wb1 = WorkbookFactory.create(fis1);
   Sheet sheet1 = wb1.getSheet("validcreads");
   Row row1 = sheet1.getRow(1);
   Cell cell1 = row1.getCell(1);
   String passdata = cell1.getStringCellValue(); //read the value fromcell
   
   driver.findElement(By.name("username")).sendKeys(userdata);
   driver.findElement(By.name("pwd")).sendKeys(passdata);
   driver.findElement(By.id("loginButton")).click();
	}

}
