package chitti;

public class ranjitha {

class A //super class
{
	int x = 10;
	void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	int y = 11;
	void print()
	{
		System.out.println("Class B");
		
	}
	
	public static void main(String[] args)
	{
		B obj = new B();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.show();
		obj.print();
	}
}

