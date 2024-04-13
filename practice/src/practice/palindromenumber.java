package practice;
import java.util.*;
public class palindromenumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");{
			int num=s.nextInt();
					int org_num=num;
					int rev=0;
					while(num!=0)
					{
						rev=rev*10+num%10;
						num=num/10;
					}
					if (org_num==rev) {
						System.out.println(org_num+"is palindrome");
					}
					else {
						System.out.println(org_num+"is not a palindrome");
					}
				}
	}
}

	
