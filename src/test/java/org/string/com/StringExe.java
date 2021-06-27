package org.string.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringExe {

	
	public static void givenIndex() {
		
		String name = "Java Exercises";
		System.out.println("position 0 is"+name.charAt(0));
		System.out.println("position 10 is"+name.charAt(10));
		
		
		
		
	}
public static void uniCode() {
		
		String name = "w3resource.com";
		System.out.println("unicode 0 is"+name.codePointAt(0));
		System.out.println("unicode 1 is"+name.codePointAt(1));
		System.out.println("unicode 10 is"+name.codePointAt(10));
	
		//Unicode before index value we will get:
		System.out.println("unicode 1 is"+name.codePointBefore(1));
		System.out.println("unicode 11 is"+name.codePointBefore(11));
		
		System.out.println("unicode count is"+name.codePointCount(2, 10));
}

public static void lexico() {
	
	
	String name1  = "This is Exercise 1";                                                                                  
	String name2 ="This is Exercise 2 ";
	int result = name1.compareTo(name2);
	
	System.out.println("lexico value is"+result);
	if (result<0) {
		System.out.println(name1+" is lesser than"+name2);
	}else if (result==0) {
		System.out.println(name1+" is equalto "+name2);
	}else {
		System.out.println(name1+" is greater than "+name2);
	}
	
}

public static void lexico2() {
	
	
	String name1 = "This is exercise 1";                                                                                  
	String name2 = "This is Exercise 1";
	int result = name1.compareToIgnoreCase(name2);
	System.out.println(result);
	if (result<0) {
		System.out.println(name1+" is lesser than"+name2);
	}else if (result==0) {
		System.out.println(name1+" is equalto "+name2);
	}else {
		System.out.println(name1+" is greater than "+name2);
	}
	


}


public static void concatinate() {
	
	
	String name1 = "PHP Exercises and";                                                                                  
	String name2 = "Python Exercises";
	System.out.println(name1.concat(name2));
	System.out.println(name1+" "+name2);

}

public static void contains() {
	
	
	String name1 = "PHP Exercises and Python Exercises";                                                                                  
	System.out.println(name1.contains("and"));
	
	String name2 = "example.com";
	String name3 = "example.com";
	String name4 = "Example.com";
	
	
	
System.out.println(name2.equals(name3));
System.out.println(name2.equals(name4));


}
//Write a Java program to create a new String object with the contents of a character array.
//O/P: this book contains234pages;
public static void characterArray() {
	
	char[] ch =new char[] {'2','3','4','5'};
	String number = String.copyValueOf(ch, 0, 3);
	System.out.println("this book contains"+number+"pages");
	

}

public static void endsWith(){
	
	String one = "Python Exercises";
	String two = "Python Exercise";
	
	System.out.println(one.endsWith("se"));
	System.out.println(two.endsWith("se"));
	
}

public static void equals(){
	
	String one = "Stephen Edwin King";
	String two = "Walter Winchell";
	String three = "Walter winchell";
	String four = "stephen edwin king";
	
	
	System.out.println(one.contentEquals(two));
	
	System.out.println(one.equals(two));
	
	System.out.println(two.equals(three));
	
	System.out.println(two.contentEquals(three));
	
	System.out.println(one.equalsIgnoreCase(four));
	
}

public static void dateandtime(){
	
	Date d = new Date();
	System.out.println(d);
	
			/* Calendar c = Calendar.getInstance();
		      System.out.println("Current Date and Time :"); 
		      System.out.format("%tB %te, %tY%n", c, c, c);
		      System.out.format("%tl:%tM %tp%n", c, c, c); 
		   */

	}


public static void byteArray(){

	String str = "This is a sample String";
	
	byte[] arr1 = str.getBytes();
	String str2 = new String(arr1);
	System.out.println("The new String equals"+str2);
}


public static void charArray(){

	String str = "[C@2a139a55";
char[] charr =	str.toCharArray();
	
	String str2 = new String(charr);
	System.out.println("The char array equals"+str2);
}



public static void indexof(){

	String str = "The quick brown fox jumps over the lazy dog";
	
	System.out.println(str.charAt(0));
	
	int a = str.indexOf("a");
	int b = str.indexOf("b");
	int c = str.indexOf("c");
	int d = str.indexOf("d");
	int e = str.indexOf("e");
	int f = str.indexOf("f");
	int g = str.indexOf("g");
	int h = str.indexOf("h");
	int i = str.indexOf("i");
	int j = str.indexOf("j");
	
	System.out.println(" a  b   c   d  e   f   g   h   i   j");
	System.out.println("======================================");
	System.out.println(a+" "+b+"  "+c+"   "+d+"   "+e+"   "+f+"    "+g+"   "+h+"   "+i+"  "+j);

}

public static void hashcode() {
	
	String str = "Python Exercises.";
System.out.println(str+"hash code is  "+str.hashCode());
	
	
}



	
	public static void main(String[] args) {
		//givenIndex();
		//uniCode();
		//lexico();
		//lexico2();
		//concatinate();
		//contains();
		//characterArray();
		//endsWith();
		//equals();
		//dateandtime();
		//byteArray();
		//indexof();
		hashcode();
	
	}
}
