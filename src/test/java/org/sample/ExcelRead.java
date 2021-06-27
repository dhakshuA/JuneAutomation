package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
	
	
	@Test
	public void readData() throws Exception {
		
		try {
			File file = new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\ExcelFolder\\Data.xlsx");
			FileInputStream fi = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet");
			for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = 	sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				String cell= row.getCell(j).toString();
					System.out.println(cell);
					
					
				}
			}
				
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
