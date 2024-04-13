package test;

public class hello {
	int a=4;
	int b=2;
	public static void main(String[] args) {
		hello obj=new hello();
		obj.a=12;
		new hello().b=15;
		System.out.println(new hello().b);
	}
}