package PKG1;

public class Arithmetic {

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
	
	public void mul(int a , int b)
	{
		int c;
		c= a*b;
		System.out.println("mul is" +c);
		
	}
	
	public static void main(String[] args) {
		
		Arithmetic obj= new Arithmetic();
		int sumResult = obj.sum(10, 2);
		int subResult = obj.sub(10, 2);
		obj.mul(sumResult, subResult);
		
	}

	
}
