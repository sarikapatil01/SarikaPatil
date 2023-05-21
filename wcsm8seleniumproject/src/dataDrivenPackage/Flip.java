package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flip {
	
	//It is use to store Generic Reusable methos
	//all the methods are NonStatic
	
	public String readExcelDada(String excelData, String sheetName,int rowCount, int cellCount)throws IOException,EncryptedDocumentException
	{
		//To read the excel data
		FileInputStream fis = new FileInputStream(excelData);
		//make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		//to get into sheet
		Sheet sheet = wb.getSheet(sheetName);
		//to desired row
		Row row = sheet.getRow(rowCount);
		//to desired cell
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
		
		
	}
	
	public int rowCount(String excelData , String sheetName) throws EncryptedDocumentException, IOException
	{
		//To read the excel data
		FileInputStream	fis=new FileInputStream(excelData);
		//make file ready to read
		Workbook	wb=WorkbookFactory.create(fis);
		//to get into sheet
		Sheet sheet = wb.getSheet(sheetName);
		//to get row count
		int rc = sheet.getLastRowNum();
		
		return rc;
	}
	
	public void writeExcelData(String excelPath,String sheetname,int rownum, int cellnum,String data) throws EncryptedDocumentException, IOException
	{
		//To Read the excel data
		FileInputStream	fis=new FileInputStream(excelPath);
		//make file Ready to read
		Workbook	wb=WorkbookFactory.create(fis);
		//to get the sheet
		Sheet sheet=wb.getSheet(sheetname);
		//to get row
		Row row = sheet.getRow(rownum);
		//to create cell
		Cell cell = row.createCell(cellnum);
		//to set the value
		cell.setCellValue(data);
		//pass value we need to create object of FileOutputStream class
		FileOutputStream	fos=new FileOutputStream(excelPath);
		//write value
		wb.write(fos);
		
	}
	

}
