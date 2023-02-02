package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 File myFile = new File("F:\\excel uju.xlsx");
    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
    
    //String cell type
   
	 Cell myCell1 = mySheet.getRow(0).getCell(0);
     System.out.println(myCell1.getCellType());
     
     String myValue1 = myCell1.getStringCellValue();
     System.out.println(myValue1);
     System.out.println("==============================");
     
     //Numeric cell type
     Cell myCell2 = mySheet.getRow(0).getCell(1);
     System.out.println(myCell2.getCellType());
     double myValue2 = myCell2.getNumericCellValue();
     System.out.println(myValue2);
     
     //boolean cell type
    Cell myCell3 = mySheet.getRow(0).getCell(2);
    System.out.println(myCell3.getCellType());
    System.out.println(myCell3.getBooleanCellValue());
    
	}
	

}
