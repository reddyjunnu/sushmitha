package practice;
public class primenumber {
		public static void main(String[]args) {
			    int n = 4;
			    int count=0;
			    for (int i = 1; i <= n / 2; i++) {
			      if (n % i == 0) {
			        count++;
			      }
			    }
			    if (count > 1) {
			        System.out.println("The number is not prime");
			    }
			    else {
			      System.out.println("The number is prime");
			    }
			  }
			}
					