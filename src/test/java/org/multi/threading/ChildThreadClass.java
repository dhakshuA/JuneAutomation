package org.multi.threading;

public class ChildThreadClass extends Thread{
	
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("  Child thread class is  executng "+i);
		}
		
	}

}
