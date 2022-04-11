package basic;

public class LearnNestedClass {
	
	// nested class  means : child class
	
	// class name : LearnNestedClass
	
	
	//parent class(LearnNestedClass)
	
	
	int nage= 44;
	static String firstName= "James";
	
	
	
	public static  class Computer{
		// child class
		
		String computerName = "Mac";
		static int ram=16;
	
		public static void main(String[] args) {
			
			System.out.println("child class");
			//create an object
			Computer myComputer = new Computer();
			System.out.println(myComputer.computerName);
			System.out.println(Computer.ram);
			
			myComputer.computerDisplay();
			
			
			
			
			LearnNestedClass learnNestedClass = new LearnNestedClass();
			System.out.println(learnNestedClass.nage);
			
		}
		public void computerDisplay() {
			
			System.out.println("this is computer display");
			
		}
		


		}
	
	
	public static void main(String[] args) {
		
		System.out.println("parent class");
		
		
		Computer myCom = new Computer();
		System.out.println(myCom.computerName);
		System.out.println(Computer.ram);
		
	}
	
	

}
