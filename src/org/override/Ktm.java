package org.override;

public class Ktm implements Bike {
   
	 private void bikedetails() {
		System.out.println("KTM Bike");
		System.out.println("==========\n");
		}
	 
	
	@Override
	public void cost() {
	System.out.println("KTM bike cost will around 3L");		
	}

	@Override
	public void speed() {
        System.out.println("KTM Bike speed is 170km/h");		
	}
	

	public static void main(String[] args) {
		
		Ktm k = new Ktm();
		k.bikedetails();
		k.cost();
		k.speed();
		
		
		
	
	}
	
	

}
