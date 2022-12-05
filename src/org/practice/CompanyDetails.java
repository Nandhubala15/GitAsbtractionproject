package org.practice;

public class CompanyDetails implements EmployeeDetails {

	

	@Override
	public void employeeName() {
          System.out.println("Nandhini");		
	}

	@Override
	public void employeeAddress() {
          System.out.println("erode");		
	}
	
	
	public static void main(String[] args) {
		
		CompanyDetails detials=new CompanyDetails();
		
		detials.employeeAddress();
		detials.employeeName();

	}

}
