package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
	//how to write excle data

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//create a file
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx.xls");
		//to make file to ready to read
		Workbook wb = WorkbookFactory.create(fis);
		//to get sheet
		Sheet sheet = wb.getSheet("IPL");
		//Create row
		Row row = sheet.getRow(1);
		//Create cell
		Cell cell = row.createCell(2);
		//set the value in cell
		cell.setCellValue("Sarika");
		//Pass the value in sheet we need to create Object FileOutPutStream
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx.xls");
		//write the data
		wb.write(fos);
		
	}

}
