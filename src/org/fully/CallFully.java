package org.fully;

public class CallFully implements FullyAbs  {
	@Override
	public void method1() {
           System.out.println("method1");		
	}

	@Override
	public void method2() {
		System.out.println("method1");		
	}
	
	private static void method3() {
		System.out.println("Method3 normal");

	}
	
	
	
	public static void main(String[] args) {
		
		CallFully c = new CallFully();
		method3();
		c.method1();
		c.method2();
	
		
	
		
	}

	

}
