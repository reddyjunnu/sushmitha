package programs;

public class dem {
	         public static void main(String args[])
	         {
	                 try{
	                 int x=Integer.parseInt(args[0]);
	                 int y=Integer.parseInt(args[1]);
	                 int z=x/y;
	                 System.out.println(z);
	                 }
	 
	             catch(ArrayIndexOutOfBoundsException ae)
	                 {
	        System.err.println("Please pass two arguments");
	                 }
	       catch(NumberFormatException ne)
	       {
	         System.err.println("Please pass two numbers only");
	       }
	         catch(ArithmeticException ae)
	     {
	         System.err.println("Please pass second argument except zero");
	       }
	     catch(Exception e)
	    {
	       System.err.println("some other errror has occured");
	    
	     }
	   
	}
	}

