package keywordDrivenPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


	//we create generic reusable method

public class Flib {
	
		//Read the data form excel sheet
		public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount)throws IOException,FileNotFoundException
		{
			//Read the Excel file
			FileInputStream	fis=new FileInputStream(excelPath);
			//make the file  ready to read
			Workbook	wb=WorkbookFactory.create(fis);
			//get sheet
			Sheet	sheet=wb.getSheet(sheetName);
			//get row
			Row	row=sheet.getRow(rowCount);
			//get cell
			Cell	cell=row.getCell(cellCount);
			//get value of cell
			String	data=cell.getStringCellValue();
			return data;
		
			}
		
		//Give the Row Count
		public int rowCount( String excelPath,String sheetName)throws IOException,FileNotFoundException
		{
			//Read the excel file
		 FileInputStream fis = new FileInputStream(excelPath);
			//make the file ready to read
			Workbook wb = WorkbookFactory.create(fis);
			//get the sheet
			Sheet	sheet=wb.getSheet(sheetName);
			//get the row
			int	rowNum=sheet.getLastRowNum();
			return rowNum;
			
			
			
		}
		
		//write ExcelData
		public void writeExcelData(String excelPath, String sheetName, int rowCount, int CellCount, String data) throws EncryptedDocumentException, IOException
		{
			//get the file
			FileInputStream fis = new FileInputStream(excelPath);
			//make file ready to read
			Workbook wb = WorkbookFactory.create(fis);
			//get sheet
			Sheet sheet = wb.getSheet(sheetName);
			//get row
			Row row = sheet.getRow(rowCount);
			//create cell
			Cell cell = row.createCell(CellCount);
			//set the cell
			cell.setCellValue( data);
			//write the data in file
			FileOutputStream fos = new FileOutputStream(excelPath);
			//make file ready to write
			wb.write(fos);
			
			
		}
		
		public String readPropertyData(String propertyPath, String Key)throws IOException,FileNotFoundException
		{
			//Provide path of property file
			FileInputStream fis=new FileInputStream(propertyPath);
			//Read the data from property file
			Properties	prop=new Properties();
			//make the property file to read
			prop.load(fis);
			//read the data
			String	data=prop.getProperty(Key);
			return data;
			
			
		}
	
}
