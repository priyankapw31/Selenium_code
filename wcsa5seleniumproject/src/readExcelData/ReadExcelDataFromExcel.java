package readExcelData;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataFromExcel {

	public static void main(String[] args) throws IOException {
		//read data from IPL sheet
		//impementation of read the data from excel
		
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx.xlsx"); //provide the path
		Workbook wb= WorkbookFactory.create(fis); //make the file for ready to read
		Sheet sheet=wb.getSheet("IPL"); //get into the sheet
		Row row = sheet.getRow(1); //get into the desired row
		Cell cell = row.getCell(1); //get into the desired cell/column
		String data = cell.getStringCellValue(); //read the data from cell
		System.out.println(data);
		
		

	}

}
