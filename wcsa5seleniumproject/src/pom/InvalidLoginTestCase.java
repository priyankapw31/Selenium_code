package pom;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		 
		//lunch the application
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//to access the read excel data create method of flib
		Flib flib = new Flib();
		
		//read last row num
		int rc = flib.getLastRowCount(Excel_path, "invalidcreads");
		
		//login to actiTime
		LoginPage lp = new LoginPage(driver);
		
		for(int i=1;i<=rc;i++)
		{
		lp.invalidloginMethod(flib.readExcelData(Excel_path, "invalidcreads", i, 0),flib.readExcelData(Excel_path, "invalidcreads", i, 1));

		}

	}

}
