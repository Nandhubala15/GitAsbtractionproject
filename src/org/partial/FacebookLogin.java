package org.partial;

//Partial abstraction
//abstraction class - may contain abstract and non abstract methods, abstract method wont accept busniess logics

public abstract class FacebookLogin {
	
	public static void login() {
		System.out.println("Go to facebook");
		
	}
	
	abstract void loginfunctionality(); {

	}
	
	abstract void logout(); {
		
	}
	
	protected void produ() {
System.out.println("bjb");
	}
	
	FacebookLogin face = new FacebookLogin() {
		
		@Override
		void logout() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		void loginfunctionality() {
			// TODO Auto-generated method stub
			
		}
	};
	
}
