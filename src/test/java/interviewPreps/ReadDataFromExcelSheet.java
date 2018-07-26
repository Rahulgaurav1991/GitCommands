package interviewPreps;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {

public static void main(String[] args) throws Exception {
	

FileInputStream fis = new FileInputStream("C:\\Selenium\\ApachePOI\\Excelsheet.xlsx");
 
 Workbook wb = WorkbookFactory.create(fis);
 
Sheet s = wb.getSheet("sheet1");
 
int rowNum=1;
int cellNum=0;
String getValueFromXLsheet = s.getRow(rowNum).getCell(cellNum).getStringCellValue();




System.out.println(getValueFromXLsheet);




}}
