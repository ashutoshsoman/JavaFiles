package asoman.tutorial.arrayExample;

public class arrayExample {

	public static void main(String[] args) {


		/*  	 
		 * this is an example of array where we can instantiate and create an array.
		 * creation of the array has the syntax as below:
		 *    int ages[] = new int[5];
		 *    float ages[] = float[5];
		 *    -- instantiation means here assignment of the values to the variables.
		 * for e.g. ages[1] = 6 ; etc..
		 * 
		 */
		System.out.println("***************Example 1**************************************");
		int age1 = 10;
		int age2 = 20;
		int age3 = 30; 	 	
		int ages[] =  {age1,age2,age3,40,50,60};
		for(int i=0; i<ages.length;i++)
		{    		 
			System.out.println(ages[i]);  
		}
		System.out.println("***************Example 2**************************************");    
		int marks[] =  new int[5];

		marks[0] = 5;
		marks[1] = 6;

		for(int i=0; i<marks.length;i++)
		{    		 
			System.out.println(marks[i]);      	 

		}

	}

}
