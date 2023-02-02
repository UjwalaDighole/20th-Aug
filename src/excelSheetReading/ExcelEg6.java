package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 File myFile = new File("F:\\excel uju.xlsx");
		    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		   
		  int lastRowNum = mySheet.getLastRowNum();
		    System.out.println("total rows in sheet are "+lastRowNum);
          
		    short lastCellNum = mySheet.getRow(0).getLastCellNum();
		    System.out.println(lastCellNum);
		    System.out.println("==================");
		    
		    int totalNoOfCells = lastCellNum-1;
		    System.out.println("total cells in sheet are " +totalNoOfCells);
	     
		    for(int row=0;row<=lastRowNum;row++)
		    {
		    	for(int cell=0;cell<=totalNoOfCells;cell++)
		    	{
		    		Cell cellType = mySheet.getRow(row).getCell(cell);
		    		CellType type = cellType.getCellType();
		    		
		    			if(type==CellType.STRING)
		    			{
		    				System.out.print(cellType.getStringCellValue()+" ");
		    			}
		    			 if(type==CellType.NUMERIC)
		    			{
		    				System.out.print(cellType.getNumericCellValue()+" ");
		    			}
		    			 if(type==CellType.BOOLEAN)
		    			{
		    				System.out.print(cellType.getBooleanCellValue()+" ");
		    			}
		    			
		    			
		    			
		    		}
		    		System.out.println();
		    	}
		    	
		    }
	}


