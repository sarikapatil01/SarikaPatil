package readExcelData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import dataDrivenPackage.Flip;

public class WriteExcelDataUsingMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Flip flip = new Flip();
		flip.writeExcelData("./data/TestData.xlsx.xls", "IPL", 1, 3, "Patil");
		

	}

}
