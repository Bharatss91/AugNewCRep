package PKG1;

public class Student 
{
	int rollno,age;
	public void method1()
	{
		System.out.println("Welcome All");
	}
	
	public void method2()
	{
		System.out.println("Automation is easy");
	}
	
	public static void main(String[] args)
	{
		Student deepak = new Student();
		
		deepak.rollno = 2308358;
		deepak.age= 32;
		
		deepak.method1();
		deepak.method2();
		
		System.out.println("Age is "+deepak.age);
		System.out.println("Rollno is "+deepak.rollno);
	}
	
}
