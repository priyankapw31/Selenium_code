package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest{
  //it is hybrid data driven framework 
	//it is combination of data driven and keyword driven framework
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(Excel_path, "invalidcreads");
		for(int i=1;i<=rc;i++)
		{
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData(Excel_path, "invalidcreads", i, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(Excel_path, "invalidcreads", i, 1));
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}

}
