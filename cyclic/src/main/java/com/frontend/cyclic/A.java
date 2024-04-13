package com.frontend.cyclic;

public class A {
	private B b;

	static {
		System.out.println("A class is loaded");
	}
	
	public A()
	{
		System.out.println("Object is created for A");
	}
	
	
	
	public void setB(B b) {
		this.b = b;
	}
	
	void show()
	{
		System.out.println("showing.....");
	}
	
	
}
public class B {
	private A a;

	static {
		System.out.println("B class is loaded");
	}
	
	public B()
	{
		System.out.println("Object is created for B");
	}
	
	public void setA(A a) {
		this.a = a;
	}
}



	