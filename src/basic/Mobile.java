package basic;

public class Mobile {
	
	// states : property
	
	String mobileName = "iphone";
	int mobileRamSize = 12;
	int mobileMemorySize = 256;
	String mobileColor= "Rose Golden";
	int price = 1200;
	
	
	// behavior
	public void calling () {
		
	System.out.println("Using mobile phone we can call mahmud bhai/ brother");	
		
		
	}
	
	public static void main (String[] args) {
		// How to create an object?
		//className objectName= new constructorOfClass();
		
		Mobile tajwarMobile = new Mobile();
		// tajwarMobile.mobileName; not allowed
		System.out.println(tajwarMobile.mobileName);// allowed to call variable using object 
		tajwarMobile.mobileName="Samsung";// allowed to call variable using object name to reAssign the variable value
		String newMobile= tajwarMobile.mobileName;
		System.out.println("New Mobile" + newMobile);
		System.out.println("********************************************");
		
		tajwarMobile.calling();//method is called by object name
		// we cannot print method
		// variable and object can be print
		
		//System.out.println(tajwarMobile.calling());
	}
	
	
	
	
	

}
