package test;

public class Reversenum {
	public static void main(String[] args) {
		int num=54321,rev=0;
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("the reverse of the given num"+ rev);
	}
}
