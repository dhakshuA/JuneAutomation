package org.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {
	
	
	public static  void read() throws Exception {
		
		FileReader fr = new FileReader("C:\\\\Users\\\\lovely\\\\eclipse-workspace1\\\\SampleTest\\\\TextFolder\\\\input.txt");
		
		BufferedReader bfr = new BufferedReader(fr);
		String str;
		while ((str = bfr.readLine()) != null) {
			
			System.out.println(str);
		}
		bfr.close();
	}
	
	
	
	public static void read2() throws FileNotFoundException {
		File file2= new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\TextFolder\\input2.txt");
		Scanner sc = new Scanner(file2);
		while (sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}
		}
	
	public static void read3() throws Exception {
		
		File file2= new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\TextFolder\\input2.txt");
		Scanner sc = new Scanner(file2);
		sc.useDelimiter(" \\z");
		System.out.println(sc.next());
		
		
	}
	
	
public static void main(String[] args) throws Exception {
	read();
	read2();
	read3();
}
}
