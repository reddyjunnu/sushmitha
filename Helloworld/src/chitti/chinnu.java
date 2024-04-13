package chitti;

public class chinnu 
	{
	    int x = 10;
	    void show()
	    {
	        System.out.println("Class A");
	    }
	}

	class B extends chinnu
	{
	    int y = 11;
	    void print()
	    {
	        System.out.println("Class B");
	       
	    }
	   
	    public static void main(String[] args)
	    {
	        B obj = (B) new chinnu();
	       
	        System.out.println(obj.x);
	        System.out.println(obj.y);
	        obj.show();
	        obj.print();
	       
	               
	    }
	}


