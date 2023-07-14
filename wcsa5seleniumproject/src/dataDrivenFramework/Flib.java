package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	
		//to store generic reusable method
		//all the methods are non static
		public String ReadExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelpath);//provide the path of file
		    Workbook wb = WorkbookFactory.create(fis); //make the file for ready to read
		    Sheet sheet = wb.getSheet(sheetname); //get into sheet
		    Row row = sheet.getRow(rowcount); //get into the desired row
		    Cell cell = row.getCell(cellcount); //get into the desired cell/column
		    String userdata = cell.getStringCellValue(); //read the value from cell
		    return userdata;
		}
		//to write a data into excelsheet
		public void writeData(String excelpath,String sheetname,int rowcount,int cellcount,String data1 ) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelpath);//provide the path of file
		    Workbook wb = WorkbookFactory.create(fis); //make the file for ready to read
		    Sheet sheet = wb.getSheet(sheetname);
		    Row row = sheet.getRow(rowcount);   
		    Cell cell = row.createCell(cellcount);
		    cell.setCellValue(data1); 
		    
		    FileOutputStream fos = new FileOutputStream(excelpath);
		    wb.write(fos);
		}
		
		//to count the last count
		public int getLastRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelpath);//provide the path of file
		    Workbook wb = WorkbookFactory.create(fis); //make the file for ready to read
		    Sheet sheet = wb.getSheet(sheetname); //get into sheet
		    int rc = sheet.getLastRowNum();     //get the last count
		    return rc;
		}
		

	}


