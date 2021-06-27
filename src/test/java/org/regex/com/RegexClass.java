package org.regex.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

	
	
	public static void method1() {
		
		String s = "welcome to java and welcome to python";
		Pattern p= Pattern.compile("welcome");
		Matcher m = p.matcher(s);
		int count =0;
		while(m.find()) {
			System.out.println(m.group());
			System.out.println("Sarts at "+ m.start()+"ends at  "+ m.end());
		count++;
		}
		
		System.out.println("no of count =  "+count);
	}
	
	//to check it starts at tamil  -use ^tamil;
	//to chek ends at languanage- use language$;
	//to check 2 char at same time we use - t|a;
	public static void method2() {
		
	String s ="tamilis the oldest language";
	//Pattern p =Pattern.compile("tamil&");
	Pattern p =Pattern.compile("l|a");
	Matcher m =p.matcher(s);
	while(m.find()) {
		
		System.out.println(m.group()+ "Starts At=  "+m.start());
	//	System.out.println(m.start()+" "+m.end());
		
	}
		System.out.println("Not ends in tamil");
	}
	
	
	
	//use array bracket []
	// to check aor b or c is there to find - [values]
	// to check aor b to print with out that  to find - [^values]
	
	public static void method3() {
		
		String s="abcabcabc123234!@#$%()";
		
		//Pattern p = Pattern.compile("[ab]");//it prints the given value
	
		//Pattern p = Pattern.compile("[^ab]"); //it prints except the given value
		
		//Pattern p = Pattern.compile("[^a-zA-z]");//if we give cap-it willremove that and print remining
		
		//Pattern p = Pattern.compile("[0-9]");
	
		Pattern p = Pattern.compile("[^a-zA-z0-9]");// to print special characters
		
		
		
		Matcher m = p.matcher(s);
		while(m.find()) {
			
			System.out.println(m.group());
		}
	}
	
	
	public static void  method4() {
		String s ="Tamil Tamilan TamilNadu123@";
		//Pattern p =Pattern.compile("\\s"); // it give space
		
		//Pattern p =Pattern.compile("\\S"); // it will print without space
		
		//Pattern p =Pattern.compile("\\d"); // it will print number only
		
		//Pattern p =Pattern.compile("\\D"); // it will print with out number.
		
	//	Pattern p =Pattern.compile("\\w");// print alphanumeric values
		
		//Pattern p =Pattern.compile("\\W");//it will print special character with space. 
		
		Pattern p =Pattern.compile("\\bTamil"); //it will print special character with space. 
		
		
		Matcher m =p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()+"  "+m.start());
			
		}
		
	}
	
	public static void validateMNo() {
		
		String mobileno = "8610063053";
		
		Pattern p = Pattern.compile("[0-9]{10}");
		Matcher m= p.matcher(mobileno);
		if (m.find()) {
			
			System.out.println("Valid Mobile number: " +m.group());
			
		}else {
			System.out.println("Not Valid Mobile number");
			
		}
		
		
	}
	
	
public static void validateMNo2() { // giving first number from 6 -9 and reaming is 9digits
		
		String mobileno = "8610063053";
		
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m= p.matcher(mobileno);
		if (m.find()) {
			
			System.out.println("Valid Mobile number: " +m.group());
			
		}else {
			System.out.println("Not Valid Mobile number");
			
		}
		
		
	}
	
public static void validateMNo3() { // giving first number from 6 -9 and reaming is 9digits AND CHECK ITS START FROM COUNTRY CODE OR ZERO
	
	String mobileno = "918610063053";
	
	Pattern p = Pattern.compile("0|91?[6-9][0-9]{9}");
	Matcher m= p.matcher(mobileno);
	if (m.find()) {
		
		System.out.println("Valid Mobile number: " +m.group());
		
	}else {
		System.out.println("Not Valid Mobile number");
		
	}
	
	
}



public static void validateMNo4() throws FileNotFoundException { // RREADING MOBILE NUMBER FROM  FILE 
	File file = new File("C:\\Users\\lovely\\eclipse-workspace1\\SampleTest\\TextFolder\\input.txt");
	Scanner sc = new Scanner(file);
	while (sc.hasNext()) {
		String next = sc.next();
		int i = next.lastIndexOf(":");
		String mobileno = next.substring(i+1);
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m= p.matcher(mobileno);
		if (m.find()) {
			
			System.out.println("Valid Mobile number: " +m.group());
			
		}else {
			System.out.println("Not Valid Mobile number");
			
		}
	}  
}


//STRING TOKENNIZER
public static void stringtoken1() {
	
	StringTokenizer token =new StringTokenizer("welcome java");
	
	while (token.hasMoreTokens()) {
		System.out.println(token.nextToken());
		
	}}

public static void stringtoken2() {
	
	StringTokenizer token =new StringTokenizer("www.facebook.com",".");
	
	while (token.hasMoreTokens()) {
		System.out.println(token.nextToken());
		
	}}


public static void stringtoken3() {
	
	StringTokenizer token =new StringTokenizer("17-08-1988","-", true);
	
	while (token.hasMoreTokens()) {
		System.out.println(token.nextToken());
		
	}}


public static void split() {
	
	String s= "http:\\www.facebook.com ";
	String[] str = s.split("\\\\|\\.|\\:");
	for (String string : str) {
		System.out.println(string);
	}}


public static void method5() {
	
	String str = "engine_stop__345_678_34_4";
	
	System.out.print(str.replaceAll("__[0-9]*_[0-9]*_[0-9]*_[0-9]", ":max"));
	
}


public static void method6() {
	
	String str = "aabbcc";
	
	
	
}




	public static void main(String[] args) throws Exception {
		//method1();
		//method2();
		//method3();
		//method4();
		//validateMNo();
		//validateMNo2();
		//validateMNo3();
		//validateMNo4();
		//stringtoken1();
		//stringtoken2();
		//stringtoken3();
		//split();
		method5();
	
	}
	
}
