package chitti;

public class exception {
	class exception_handling {
		 public static void main(String args[]) { 
		 try { 
		 int a[] = {1, 2,3 , 4, 5};
		 for (int i = 0; i < 5; ++i)
		 System.out.print(a[i]); int x = 1/0;
		 } 
		 catch(ArrayIndexOutOfBoundsException e) { System.out.print("A"); 
		     } 
		 catch(ArithmeticException e) {  
		   System.out.print("B"); }
		 }
		 }

}
