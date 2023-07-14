package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		//to call the webelements of login page create the object of login page class
		LoginPage lp = new LoginPage(driver);
		
		//reduce the length of code create method in BaseTest class & call it 
		lp.validloginMethod(flib.readPropertyData(Property_path, "Username"),flib.readPropertyData(Property_path, "Password"));
		
//        //by calling the getter method
//		lp.getUnsTB().sendKeys(flib.readPropertyData(Property_path, "Username"));
//		lp.getPswTB().sendKeys(flib.readPropertyData(Property_path, "Password"));
//		lp.getLoginButton().click();
	}

}
