package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 File myFile = new File("F:\\excel uju.xlsx");
		    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
// reading same type of data
		    //outer for loop
		    for(int row=0;row<=1;row++)
		    {
		    	for(int cell=0; cell<=4;cell++)
		    	{
		    		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		    	     System.out.print(value+" ");
		    	}
		    	System.out.println();
		    }
	}

}
