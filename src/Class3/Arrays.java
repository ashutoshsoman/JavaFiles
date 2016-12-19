package Class3;

public class Arrays {

	public static void main(String[] args) {
		
 
		
		//Array is a datastructure mainly useful to store set of values having same datatype
		//Syntax of an Array
		//Datatype arrayName[] = new Datatype[size];
		//Single dimension Array
		    int arr[] = new int [10];
		    
		    System.out.println(arr[0]);
		    System.out.println(arr[1]);
		    System.out.println(arr[4]);
		    arr[0]=20;
		    
		    System.out.println("Arraylength"+ arr.length);
		    			
			for(int i=0;i<arr.length;i=i+1)
			{
				System.out.println("Array Values"  + arr[i]);
			}
			
		    //Printing the values from an array wihtout using index
			//for-each  or enhanced forloop
//			for(data_type variable : array | collection)
//			{
//
//			}  

			for(int x : arr)
			{
				System.out.println("for each " +x);
			}
		    
		    
		    
		    
		    
		    
		    System.out.println(arr[0]);
		    
		    int arr1[] = {10,20,30,40,50};
		    
		    
		    int matrix[][] = new int[2][2];
		    System.out.println(matrix[0][0]);
		    
	}
	
}
