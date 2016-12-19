/* Assignment 1........................................
 * 		for(int i =0 ; i < ages.length ; i++) {
			System.out.println("ages["+i+"]"  +  "  " + ages[i]);
		}
Add up all the ages...			
While in the for loop if the value of age is more than 50 then print.. YOU R OLD

 */

package asoman.tutorial.arrayExample;



public class arrayAssignment {

	public static void main(String[] args) {

		int ages[] = new int[5];

		ages[0] = 5;
		ages[1] = 10;
		ages[2] = 20;
		ages[3] = 30;
		ages[4] = 40;

	//	System.out.println(ages.length);
		
		int sum = 0;
		
		for( int i =0; i <ages.length; i++)
		{
			sum = sum +ages[i];
			
			if (sum > 50)
			{
				System.out.println("YOU R OLD");
			} else { }
				
		}
		
		System.out.println("the addition of ages is = "+ sum);
		
	}
}

//		for (int i = 0 ; i < ages.length ; i++ ){
//
//			int addition = ages[i] + ages[i+1] ;
//
//			for (int j = 0; j<=i ; j++){
//
//				int addition1= addition + ages[j+2];
//                            for (int k = 0; k <=j ; k++){
//                            	 int addition2= addition1 + ages[j+3];
//                                
//                                 
//                                 for (int l = 0; l <=k ; l++){
//                                	 int addition3= addition2 + ages[j+4];
//                                     System.out.println(addition3);
//                                      break;
//                                      }
//                                 break;
//                            }
//                    break;
//			}
//         break;
//		}
//	}
//}
