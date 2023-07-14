package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestcaseActiTime extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(Property_path, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(Property_path, "Password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		bt.closeBrowser();
		

	}

}
