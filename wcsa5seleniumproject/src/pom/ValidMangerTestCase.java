package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidMangerTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		//open the browser & lunch the application
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		//login into acti time
		LoginPage lp = new LoginPage(driver);
		lp.validloginMethod(flib.readPropertyData(Property_path, "Username"),flib.readPropertyData(Property_path, "Password"));
		
		//click on user module
		HomePage hp = new HomePage(driver);
		hp.clickOnUserModule();
		
		//create new user
		UsersPage up = new UsersPage(driver);
		up.createManager(flib.readExcelData(Excel_path,"managercreads", 1, 0),flib.readExcelData(Excel_path, "managercreads",1, 1), flib.readExcelData(Excel_path, "managercreads",1, 2), flib.readExcelData(Excel_path, "managercreads", 1, 3));
        
	}

}
