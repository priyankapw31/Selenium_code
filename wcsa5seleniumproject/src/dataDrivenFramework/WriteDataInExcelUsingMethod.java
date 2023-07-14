package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WriteDataInExcelUsingMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// write data in excel by creating the object 
		//crete object for flib
		Flib flib = new Flib();
		flib.writeData("./data/TestData.xlsx.xlsx", "IPL", 2, 2, "nashik");

	}

}
