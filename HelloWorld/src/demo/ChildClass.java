package demo;

public class ChildClass extends ParentClass{

	String StringValue = "Sting Value From Child Class";

	public void printOutput() {
		
		System.out.println("Printing from child class");
	}
	
	public void dummy() {
		printOutput();
		super.printOutput();
		//System.out.println("Printing from child class");
	}


}
