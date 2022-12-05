package org.multiple;

public class Desktop implements Hardware,Software {
	
   private void desktopModel() {
       System.out.println("Desktop  model");
}

	@Override
	public void softwareResourses() {
		System.out.println("SoftwareResources");
		
	}

	@Override
	public void hardwareRescourses() {
System.out.println("Hardware Resources");		
	}
	
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
				
        d.desktopModel();
		d.softwareResourses();
		d.hardwareRescourses();
	}

}
