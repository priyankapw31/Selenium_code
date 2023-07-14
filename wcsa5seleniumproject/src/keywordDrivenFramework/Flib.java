package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//it is use to read the data from excel file
	public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
	}
	//it is use to write data the data into excel
	public void writeExcelData(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}
	
	//to get the last rowcount
	public int getLastRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int data = sheet.getLastRowNum();
		return data;
	}
	
	//it is use to read the data from Properties file
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		//create a obj of properties class
		Properties prop = new Properties();
		//make a file ready for read
		prop.load(fis);
		//read the particular key fom file
		 String data = prop.getProperty(key);
		 return data;
	}

}
