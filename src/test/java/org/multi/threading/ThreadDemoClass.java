package org.multi.threading;

public class ThreadDemoClass {
	public static void main(String[] args) throws Exception {
		
		ChildThreadClass ch =new ChildThreadClass();
		ch.start();
		Thread.sleep(2);
		ch.stop();
		
	}

}
