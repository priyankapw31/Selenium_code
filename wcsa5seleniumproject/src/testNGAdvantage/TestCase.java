package testNGAdvantage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
@Listeners
public class TestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		driver.findElement(By.name("Username")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
}
