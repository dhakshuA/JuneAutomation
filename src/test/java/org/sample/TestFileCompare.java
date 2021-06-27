package org.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class TestFileCompare {
	
	public static void compare() throws Exception {
		
		
		File file= new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\TextFolder\\input.txt");
		File file2= new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\TextFolder\\input2.txt");
		
		FileReader fr = new FileReader(file);
		FileReader fr1 = new FileReader(file2);
		
		BufferedReader bfr = new BufferedReader(fr);
		BufferedReader bfr1 = new BufferedReader(fr1);
	boolean areEqual = false;
	int lineNumber =1;
	
		String r1 ;
		String r2 ;
		
		while ((r1 = bfr.readLine())!=null && (r2 =bfr1.readLine())!=null) {
			System.out.println(r1);
			System.out.println(r2);
			if (r1.equalsIgnoreCase(r2)) {
				areEqual=true;
				 lineNumber++;
				
			}else {
				areEqual =false;
			}
			
			if (areEqual) {
				System.out.println(" file are same");
			}else {
				System.out.println(" file are not same");
			}	
			
		}
		bfr.close();
		bfr1.close();
	}
	
	
    

	public static void main(String[] args) throws Exception {
		compare();
	}
	
}
