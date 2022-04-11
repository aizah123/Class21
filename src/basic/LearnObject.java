package basic;

public class LearnObject {
	
	// object : an instance of a class and it will help us to call the states?Variables and behavior/methods. 
	// blueprint of class
	 
	public static void main(String[] args) {
		
		// How to create an object?
	    //className objectName= new constructorOfClass();
		// using object we can call states and behavior
		
		
		Mobile yourMobile= new Mobile();
		yourMobile.mobileName ="LG";
		System.out.println("Your Mobile " + yourMobile.mobileName);
	
		
		Mobile herMobile= new Mobile();
		herMobile.mobileName ="Nokia";
		System.out.println("Her Mobile " + herMobile.mobileName);
		
		Mobile hisMobile= new Mobile();
		hisMobile.mobileName ="iPhone";
		System.out.println("His Mobile " + hisMobile.mobileName);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
