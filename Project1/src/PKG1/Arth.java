package PKG1;

public class Arth {

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
		System.out.println("Sub is" +a3);
		return a3;
	}
	
	public int multiplication(int a , int b)
	{
		int d;
		d= a*b;
		System.out.println("mul is" +d);
		return d;
	}
	
	public void Div(int a , int b)
	{
		int e;
		e= a/b;
		System.out.println("Final Result is " +e);
		
	}
	
	public static void main(String[] args) {
		
		Arth obj= new Arth();
		int sumResult = obj.sum(10, 2);
		int sumResult1 = obj.sum(sumResult, 2);
		int subResult = obj.sub(sumResult1, 2);
		int mulResult = obj.multiplication(subResult, 2);
		obj.Div(mulResult, 2);
					
		
	}
}
