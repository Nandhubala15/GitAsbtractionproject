package org.partial;

import org.partial.University;

public class College extends University{
	
	@Override
	public void ug() {
		System.out.println("ug courses applications started");
		
	}
	
	@Override
	public void pg() {
		System.out.println("PG Courses application started");
		
	}

	public static void main(String[] args) {
		 College c = new College();
		 
		 c.ug();
		 c.pg();
		

	}

}
