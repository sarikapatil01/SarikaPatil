package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//How to Generalize the row count
				FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx.xls");
				
				Workbook wb2 = WorkbookFactory.create(fis2);
				
				Sheet sheet2 = wb2.getSheet("IPL");
				
				//get last row of the sheet
				int rowCount = sheet2.getLastRowNum();
				
		
		//Read multiple data using for loop

		for(int i=1; i<rowCount; i++)
		{
		//To read the Excel Data
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx.xls");
		
		//Make the file ready for read
		Workbook wb = WorkbookFactory.create(fis);
		
		//to get into the Excel sheet
		Sheet sheet = wb.getSheet("IPL");
		
		//to get row
		Row row = sheet.getRow(i);
		
		//to get cell/column
		Cell cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		Thread.sleep(2000);
		System.out.println(data);
		}
		
		
		
		
	}

}
