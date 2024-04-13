package practice;

public class UnequalNumbers {
	public static void main( String args[] ) {
	       int[] arr = {1, 2, -4, 5,7,-5};
	       int n = arr.length;
	       for(int i=0; i<n; i = i+3){
	         System.out.println(arr[i]);
	       }
	         for(int j=1; j<=n; j=j+2) {
	        	 System.out.println(arr[j]);
	         }
	       }
	}


