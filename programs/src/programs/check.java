package programs;
import java.util.*;
public class check{
	public static void main(String args[])
	{
		int num;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		num = s.nextInt();
		if(num %2 == 0) {
		System.out.println("The number is even");
	}
	else {
		System.out.println("The number is odd");
	}
	}
}

	