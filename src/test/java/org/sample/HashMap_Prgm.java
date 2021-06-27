package org.sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Prgm {
	
	/*
	 *put 
	 * piuAll
	 * getKe
	 * Get(Ke and Value)
	 * 
	 * 
	 * 
	 */
	
	public static void method1() {
		
		HashMap hm = new HashMap();
		hm.put("apple",30 );
		hm.put("banana",20 );
		hm.put("grapes",30 );
		hm.put("grapes",40 );// it will take the recent key and replace the original.
		System.out.println(hm);
		
		
		HashMap hm1 = new HashMap();
		hm1.putAll(hm);  // put All method is to add add the data from hm to hm1
		System.out.println(hm1);
		//get(key); Get using Key
		System.out.println(hm.get("apple")); //it will return the value of apple
		
		//containsKey(key);
		hm1.containsKey("grapes");
		System.out.println(hm1.containsKey("grapes")); //it will return true or false
		//COntains value:
		hm1.containsValue(10);
		System.out.println(hm1.containsValue(10)); // false,bcoz the value 10 is not there
		System.out.println(hm1.isEmpty()); // it will returnfalse
		
		hm1.remove("grapes");
		System.out.println(hm.remove("grapes")); // now removing of grapes will give ou the value and its removed for the Data
		System.out.println(hm1); 
		hm1.clear(); // it will clear the map
		System.out.println(hm1); //i will return null set{}
		System.out.println(hm);
		//SIZE:
		System.out.println(hm.size());
		
	}
	
	
	

	public static void method2() {
		
		//Entr Set:
		
		HashMap hm = new HashMap();
		hm.put("apple",30 );
		hm.put("banana",20 );
		hm.put("grapes",30 );
		hm.put("grapes",40 );// it will take the recent key and replace the original.
		
	//	System.out.println(hm);  //{banana=20, apple=30, grapes=40}
		
		Set ke  =hm.entrySet();
	//	System.out.println(ke); //[banana=20, apple=30, grapes=40]
		
		Collection val = hm.values();
		//System.out.println(val);

	//	ITERATE THE MAP:
		
		Set<Entry<Object, Object>>  ma =hm.entrySet();
		for (Entry<Object, Object> entry : ma) {
			Object v = entry.getKey();
			Object vv = entry.getValue();
			System.out.println(entry.getKey() );
			System.out.println( entry.getValue() );
			//entry.setValue(400); // we need to set the value - replace the existing value
			
			if (vv.equals(20)) {
				entry.setValue(48);
			}
			System.out.println( entry.getValue() );
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
	//	method1();
		method2();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
