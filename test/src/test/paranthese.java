package test;
import java.util.*;
public class paranthese {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the paranthese:");
	String in=sc.nextLine();
	int length=in.length()-1;
	int s=0,c=0;
	if(in.charAt(0)=='{') {
		for(int i=0;i<=length;i++) {
		if(in.charAt(i)=='{') {
			s=s+1;
		}
		else {
			c=c+1;
		}
	}
	if(s==c) {
		System.out.println("balance");}
		else {
			System.out.println("unbalanced");
		}
	}
	}
}