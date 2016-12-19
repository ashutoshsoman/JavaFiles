/* Calculate Average value for the below array.
 * int[] numbers = new int[]{10,20,15,25,16,60,100};
 */


package asoman.tutorial.arrayExample;

public class arrayAverage {

	public static void main(String[] args) {
		
		int[] numbers = new int[]{10,20,15,25,16,60,100};
		int sum = 0;
		
		for ( int i =0 ; i< numbers.length ; i++){
			
		    sum = sum + numbers[i];		
						
					}
		System.out.println(246/7);
		System.out.println("the Average of the numbers is " + sum/numbers.length);
	}

}
