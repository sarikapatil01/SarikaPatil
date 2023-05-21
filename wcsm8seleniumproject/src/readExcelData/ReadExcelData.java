package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//Read data form IPL Excel Sheet
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx.xls");
		//make the file ready for input
		Workbook wb = WorkbookFactory.create(fis);
		//get into the sheet
		Sheet sheet = wb.getSheet("IPL");
		//get into desired row
		Row row = sheet.getRow(2);
		//get into desired col/cell
		Cell cell = row.getCell(1);
		//read the value frome cell
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
	}

}
