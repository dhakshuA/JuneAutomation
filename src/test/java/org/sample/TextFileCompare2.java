package org.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.chainsaw.Main;

public class TextFileCompare2 {

	public static void compare2() throws Exception {
		
		
		File file1 = new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\TextFolder\\javaText.txt");
		File file2 = new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\TextFolder\\seleniumText.txt");
		
		FileReader fr1 = new FileReader(file1);
		FileReader fr2 = new FileReader(file2);
		
		
		
		BufferedReader bf1 = new BufferedReader(fr1);
		BufferedReader bf2 = new BufferedReader(fr2);
		
		boolean areEqual=false;
		int lineNumber =1;
		String str1;
		String str2;
		
		
		while ((str1=bf1.readLine())!=null && (str2=bf2.readLine())!=null) {
			
			System.out.println(str1);
			System.out.println(" testing execution checking  ");
			
			System.out.println(str2);
			if (str1.equalsIgnoreCase(str2)) {
				areEqual= true;	
				lineNumber ++;
				
			}else {
				areEqual= false;
			}
			if (areEqual) {
				System.out.println(" Both are Equal");
			}else {
				System.out.println(" Both are not Equal");
			}
		 	}
		 bf1.close();
		  bf2.close();
		
	}
	
public static void main(String[] args) throws Exception {
	compare2();
}	
	
}
