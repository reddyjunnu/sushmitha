package programs;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int n,rev = 0,r,org;
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
				n = s.nextInt();
				org = n;
				while(n!=0) {
					r=n%10;
					rev=rev*10+r;
					n/=10;
				}
				if(org == rev)
					System.out.println(org+"is a palindrome.");
				else
					System.out.println(org+"is not a palindrome");
	}
}