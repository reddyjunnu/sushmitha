package programs;
import java.util.*;
public class stackoperation {
		public static void main(String[] args) {
			
			Stack <Integer> s=new Stack();
			s.push(2);
			s.push(8);
			System.out.println(s);
		    s.pop();
		    System.out.println(s);
		    s.peek();
		    System.out.println(s);
		    Enumeration e=s.elements();
		    while(e.hasMoreElements())
		    {
		    System.out.println(e.nextElement());
		    }
		    }
		    }
		    
		    
		    
		    
		    
		    