package Class3;
 
public class CalculatorApp{
     
//  modifier returntype methodname(arg1,arg2,arg3,....)
//  {
//
//      //block of statements
//
//      return value;
//
//  }
     
    /*public modifier
    int returntype
    add methodname
    int a,int b arguments
    c return value
    return value type should match return  type*/
     
    //global variables cannot be duplicated..
     
//  int a;
//  int a;
     
   int i;
    static int j;
     
    public int add(int a,int b)
    {
        int c = a+b;
        return c;
    }
     
    public int subtract(int a,int b)
    {
        int c = a-b;
        return c;
    }
    public static int multiply(int a,int b)
    {
        int c = a*b;
        return c;
    }
     
     
    //void means this method doesnt return any value
    public void add()
    {
        int c = 2+3;
        System.out.println(c);
    }
}
     
