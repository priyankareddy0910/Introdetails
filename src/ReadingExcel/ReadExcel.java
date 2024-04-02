package ReadingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		//excel file workbook sheet rows cell 
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\Documents\\Prathyusha\\Introduction\\Testdata\\data.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		  int totalrows = sheet.getLastRowNum();
		  
		 int totalcells =  sheet.getRow(0).getLastCellNum();
		 
		 
		 System.out.println(totalrows);
		 
		 System.out.println(totalcells);
		 
		 
		 for(int r=0;r<=totalrows;r++) {
			 
			 XSSFRow  currentrow =  sheet.getRow(r);
			 
			 for(int c=0;c<totalcells;c++) {
				 
				 String value = currentrow.getCell(c).toString();
				 
				 System.out.print(value+"        ");
				 
			 }
			 
			 System.out.println();
			 
			 
			 
		 }
		 
		 workbook.close();
		 file.close();
		 
		 
		 
		 
		 
		  
		  
		
		
		
		
		
		
		
		
	}



		
	
	

}


