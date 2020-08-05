package PKG1;

public class Arth2 {

	public int sum(int a , int b)
	{
		int c;
		c= a+b;
		System.out.println("Sum is" +c);
		return c;
	}
	
	public int sub(int a , int b)
	{
		int a3;
		a3= a-b;
		System.out.println("Sub is " +a3);
		return a3;
	}
	
	public int multiplication(int a , int b)
	{
		int d;
		d= a*b;
		System.out.println("mul is " +d);
		return d;
	}
	
	public void Div(int a , int b)
	{
		int e;
		e= a/b;
		System.out.println("Final Result is " +e);
		
	}
	
	public static void main(String[] args) {
		
		Arth2 obj= new Arth2();
		int subResult = obj.sub(10, 2);
		int sumResult = obj.sum(subResult, 2);
		int subResult1 = obj.sub(sumResult, 2);
		int mulResult = obj.multiplication(subResult1, 2);
		obj.Div(mulResult, 2);
					
		
	}
}
