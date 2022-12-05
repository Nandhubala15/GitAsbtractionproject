package org.inter;

public class LinkAdhar implements AdharCard{

	@Override
	public void panCard() {
		System.out.println("Link adhar to panCard");
		
	}

	@Override
	public void rationCard() {
        System.out.println("Link Adhar to Rationcard");		
	}

	@Override
	public void passbook() {
		System.out.println("Attach Adhar to bank passbook");
		
	}
	public static void main(String[] args) {
		
		LinkAdhar l = new LinkAdhar();
		
		l.panCard();
		l.rationCard();
		l.passbook();
	}
	
	

}
