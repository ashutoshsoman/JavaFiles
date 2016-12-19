package Class3;

public class Subclass extends Superclass {

		public void display()
		{
			System.out.println("In SubClass");
		}
	
	public static void main(String[] args) {
	
		Subclass S1 =  new Subclass();
		S1.display();			
// Super class can store subclass objects. During execution if creates subclass object and hence the output.
		Superclass S2 =  new Subclass();
		S2.display();
		}

	}	

 /*This is the program which tells to inherit the methods of a Superclass into a subclass
when this programm is executed then if the display method is available in Subclass then 
it will print the output of the method defined in Subclass other wise it looks for a method 
of superclass and then creates the output */