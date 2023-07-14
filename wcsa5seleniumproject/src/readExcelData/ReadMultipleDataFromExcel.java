package readExcelData;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		//read data from IPL sheet
		
		//implementaion of read the data from excel
		//read multiple values or data from excel sheet by using for loop
		
		for(int i=0;i<=10;i++)
		{
			FileInputStream fis=new FileInputStream("./data/TestData.xlsx.xlsx"); //provide the path
			Workbook wb= WorkbookFactory.create(fis); //make the file for ready to read
			Sheet sheet=wb.getSheet("IPL"); //get into the sheet
			Row row = sheet.getRow(i); //get into the desired row
			Cell cell = row.getCell(0); //get into the desired cell/column
			String data = cell.getStringCellValue(); //read the data from cell
			Thread.sleep(2000);
			System.out.println(data);
		}
		

	}

}
