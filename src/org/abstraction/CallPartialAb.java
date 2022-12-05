package org.abstraction;

public class CallPartialAb extends PartialAbstraction  {
	@Override
	public
	void method1() {
System.out.println("Abstract Method");		
	}

	public static void main(String[] args) {
		
		CallPartialAb c = new CallPartialAb();
		
		c.method1();
		method2();
		
	}

	

}
