package practice;
public class Alternatenumbers{
	public static void main( String args[] ) {
	       int [] arr= {1,-2,-4,-6,9,-7};
	       int[] result = new int[arr.length];
	       for(int i=0;i<arr.length;i++)
	    	   result[i]=arr[i/2+(i%2)*(arr.length/2)];
	    	   for(int num:result)
	    		   System.out.println(num+"");
	    	  
	       }
	    	   
	       }
	      