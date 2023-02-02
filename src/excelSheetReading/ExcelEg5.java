package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 File myFile = new File("F:\\excel uju.xlsx");
		    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
          for(int row=0;row<=2; row++)
          {
        	  for(int cell=0; cell<=3; cell++)
        	  {
        		  CellType type = mySheet.getRow(row).getCell(cell).getCellType();
        		  if(type==CellType.STRING)
        		  {
        			  String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
        			  System.out.print(value+" ");
        		  }
        		  else if(type==CellType.NUMERIC)
        		  {
        			double value = mySheet.getRow(row).getCell(cell).getNumericCellValue();
        		    System.out.print(value+" ");
        		  }
        		  else if(type==CellType.BOOLEAN)
        		  {
        			 boolean value = mySheet.getRow(row).getCell(cell).getBooleanCellValue();
        		     System.out.print(value+" ");
        		  }
        	  }
        	  System.out.println();
          }
	}

}
