public class Example 
{
	static int a =10;

	static void m1(){
		System.out.println(a);
	}

	public static void main(String[] args){
		
		m1();
	}
}


class Sample
{

	static void  m2(){
		System.out.println(Example.a);
	}

public static void main(String[] args){
		
		m2();
	}
}
