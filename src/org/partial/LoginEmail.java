package org.partial;

public class LoginEmail extends FacebookLogin {
	@Override
	void loginfunctionality() {
	System.out.println("login email");
		
	}
	
	public static void login() {
		System.out.println("Go to Facebook");
	}

	public void Phnno() {
		System.out.println("Enter the Phone Number");
	}
	
	@Override
	void logout() {
	   System.out.println("Logout with email");
		
	}
	
	@Override
	protected void produ() {
		System.out.println("nui u");
	}
	
	public static void main(String[] args) {
		
		LoginEmail le = new LoginEmail();
		
		LoginEmail.login();
		le.loginfunctionality();
		le.Phnno();
		le.logout();
	}
	
}
