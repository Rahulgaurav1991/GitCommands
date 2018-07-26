package interviewPreps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatainXLsheet {
	public static void main(String[] args) throws Exception, InvalidFormatException, IOException {
		//File file = new File("C:\\Selenium\\ApachePOI\\Excelsheet.xlsx");   /// we can avoid this line it doesn't affect
		FileInputStream fis = new FileInputStream("C:\\Selenium\\ApachePOI\\Writedata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);              
		Sheet sheet = wb.getSheet("sheet1");
		int rowCount = sheet.getLastRowNum();
		 sheet.createRow(rowCount).createCell(0).setCellValue("value to be set"); //write data 
	       //we can use getRow() and getCell if row and columns already exist
		//-sheet.getFirstRowNum();             // to get the current count of rows
		       System.out.println(rowCount);                               // to get the first row
  /*Row newRow = sheet.createRow(rowCount+1);       // to add 1 more row
 Cell cell = newRow.createCell(0);     
 cell.setCellValue("5123444");  */            // to add new cell in newly created row 
	      
	        
	        System.out.println(sheet.getLastRowNum());
	        
	        FileOutputStream outputStream = new FileOutputStream("C:\\Selenium\\ApachePOI\\Writedata.xlsx");
             wb.write(outputStream);
		
                        //close the inputstream
fis.close();

	}

}
