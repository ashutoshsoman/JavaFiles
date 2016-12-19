//Accessing the methods by creating objects

public class Instantiation {
	
	float f1;
    float f2;
	float f3;
	
	 void Add(float f1, float f2)
	 {
		 f3 = f1+f2;
		 System.out.println("The Addition is:"+f3);
	 }
	  void Mul(float f1 , float f2)
	  {
		  f3 = f1*f2;
		  System.out.println("The Multiplication is:"+f3);
		  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Instantiation  x = new Instantiation();/* in order to create an object we need 
       instantiaite it */

       x.Add( 2.5f, 2.5f);
       x.Mul(2.5f, 2.5f);
     
	}

}
