package com.frontend.cyclic;

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

