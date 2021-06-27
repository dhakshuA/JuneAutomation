package org.string.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.chainsaw.Main;

public class GettingKandV {

 static Map<String, String> ma = new LinkedHashMap<String, String>();
	
static String s = "https://www.google.com/search?gs_ssp=eJzj4tTP1TcwTkqzzFBgNGB0YPDiTM5Pz8usSswrAQBYzwdd&q=cognizant&oq=congni&aqs=chrome.1.69i57j46i10i199i291i433j0i10i433l2j0i10j0i10i433j0i10j0i10i433l2.2707j0j7&sourceid=chrome&ie=UTF-8";	



	public static void method1() {
		
		String input = s;
		Pattern pattern = Pattern.compile("(\\w+)=?([^&]+)?");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
		    System.out.println(" - Key   : "+matcher.group(1));
		    System.out.println("   Value : "+matcher.group(2));
		}

		
	}
	
	
public static void method2() {
	String original= "https://www.google.com/search?q=cognizant&rlz=1C1CHBD_enIN904IN904&oq=cognizant&aqs=chrome.0.69i59j35i39j0i433l2j0j0i433l2j46i175i199j0j0i131i433.4665j0j15&sourceid=chrome&ie=UTF-8";
	Map<String, String> li=new LinkedHashMap();
	String[] split1 = original.split("\\?");
	String a = split1[1];
	String[] split2= a.split("&");
	for (int i = 0; i < split2.length; i++) {
		String b=split2[i];
		String[] split3= b.split("=");
		for (int j = 0; j < split3.length; j++) {
			String k = split3[j];
			String v = split3[j+1];
			li.put(k, v);
		}
	    System.out.println(li);
	
	}
	
	
	
	
	
}
	
	
	public static void main(String[] args) {
		
		method2();
	}
}