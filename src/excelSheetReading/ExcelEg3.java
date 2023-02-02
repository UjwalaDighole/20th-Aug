package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		 File myFile = new File("F:\\excel uju.xlsx");
    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
   //reading whole row data-->cell is varying and row is constant
    
    for(int i=0; i<=4; i++)//0,1,2,3
    {
      String value1 = mySheet.getRow(0).getCell(i).getStringCellValue();
       System.out.println(value1+"");

	}
    System.out.println();
    System.out.println("==============================");
    //how to read whole cell(column)-->cell is constant and row is varying
    for(int i=1; i<=4; i++)
    {
     String value2 = mySheet.getRow(i).getCell(0).getStringCellValue();
     System.out.println(value2);  
	}
}
}