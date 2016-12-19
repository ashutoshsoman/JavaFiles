package Class3;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println("*******FOR LOOP*********");		
	 for(int i=0;i<10;++i)
		{
			System.out.println("selenium"+ i);
		}
	 
	 // while loop
	System.out.println("*******WHILE LOOP*********");	 
	 int j= 0;
	 while(j<10)
	 {
		 System.out.println("the value is " +j );
		 j++;
		 
	 }
	 System.out.println("*******Do WHILE LOOP*********");	
     // do while
	 // execute the condition and even if the condition is not true it executes the code atleast once
	 int k = 0;
	 do
	 {
		 System.out.println("in do while" + k);
		 k++;
	 }while(k>10);
	}
	

}
