package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CompareTwoFiles {
	
	public static   String cell2 ;

	public  static  String cell ;

	
	
	
	@Test
	public void readData() throws Exception {
		
				
		
		try {
			File file = new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\ExcelFolder\\Data1.xlsx");
			File file1 = new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\ExcelFolder\\Data2.xlsx");
			FileInputStream fi = new FileInputStream(file);
			FileInputStream fi1 = new FileInputStream(file1);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Data");
			for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = 	sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				 cell= row.getCell(j).toString();
					System.out.println(cell);
			}}try {
				
				Workbook wb1 = new XSSFWorkbook(fi1);
				Sheet sh2 = wb1.getSheet("Data2");
				for (int i1 = 0; i1 < sh2.getPhysicalNumberOfRows(); i1++) {
				Row row2 = 	sh2.getRow(i1);
				for (int j1 = 0; j1 < row2.getPhysicalNumberOfCells(); j1++) {
					 cell2= row2.getCell(j1).toString();
						System.out.println(cell2);
				
				
						if (cell.length()==cell2.length()) {
							
							System.out.println( " Equal");
						}else {
							System.out.println("not equal");
						}
						
				}
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
	
}}




