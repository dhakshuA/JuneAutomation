package org.string.com;

public class StringClass {
	
	

	public static void normalMethods() {
	String s  = "Java Excersise"; //literal String 
	System.out.println(s);
	String s1=new String(" Welcome");
	 s  = "Java"; // after we assigned it will change.
	 String s3 = "     ";
	
	 System.out.println(s);
	System.out.println(s1);	
	System.out.println(s1);	
	
	//concade:
	System.out.println(5+4);
	System.out.println("java"+"welcome");
	
	//length;
	System.out.println(s.length());

//isBlank- it will check is that blanck

System.out.println(s3.isBlank());

//isempty:
System.out.println(s3.isEmpty()); // ("   ") if we give like this it will return false 

// we are adding new string to alrad existing string: 
s = s+"Excersise";
System.out.println(s);


//== and .equals:
if (s==s1) {
	System.out.println(" Yes");
}else {
	System.out.println(" NO");
}

if (s.equals(s1)) {
	System.out.println(" Yes");
}else {
	System.out.println(" No");
}

	}
	
	
	
	public static void comparisionMethods() {
		String s = "java";
		String s1="java";
		String s2="welcome java";
		String s3="JAVA";
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equalsIgnoreCase(s3));
		
		
		//Lexicograpy:
		System.out.println(s.compareTo(s2));
		System.out.println(s2.compareTo(s));
		System.out.println(s.startsWith("ja"));
		System.out.println(	s.endsWith("a"));
		System.out.println(s2.startsWith("java", 8));
		System.out.println(s.contentEquals(s1));
		
		System.out.println(s.compareToIgnoreCase(s3));
		
		
	}
	
	
	public static void regex() {
		
		String word= "chennai 600018 ";
		//int num =Integer.parseInt(word);
		//System.out.println(num); // Number format exception will vome,bcozof string also is there.
		
		//printthe count of numbers:
		int count = 0;
		for (int i = 0; i < word.length()-1; i++) {
			
			if (word.charAt(i)>='0') {
				if (word.charAt(i)<='9') {
					
					count++;
				}
				
			}
		
		}
		System.out.println(count);
	String number = word.replaceAll("[a-zA-Z]", "");
	System.out.println(number);
	System.out.println(word.replaceAll("[0-9]", ""));
		System.out.println(word.replace("//s ","" ));
	
		for (int i = 0; i < word.length()-1; i++) {
		if (word.length()==number.length() ) {
			System.out.println("only numbers");
			
		}	else {
			System.out.println(" numbers with others");
		}
			
		}
		
		
	}
	
	
	public static void repeat() {
		
		String word = "window";
		int count=0;
		for (int i = 0; i < word.length()-1; i++) {
			char ch = word.charAt(i);
		if (ch=='w') {
			count++;
			System.out.println("rpeated");
		}else {
			
			System.out.println("not repeat");
		}
		}
		
	}
	
	
	public static void main(String[] args) {
	//normalMethods();
	//comparisionMethods();
	//regex();
		repeat();
		
	}
	
	
	
	
	
	

}
