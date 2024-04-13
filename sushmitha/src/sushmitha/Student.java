package sushmitha;

public class Student {  
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Student(int id,String name){  
	       this.id = id;  
	      this.name = name;  
	    }  
	    //method to display the values  
	    void display(){
	           System.out.println(id+" "+name);
	    }  
	   public static void main(String args[]){  
	     Student s1 = new Student(111,"Karan"); 
	     Student s2 = new Student(112,"Aryan");  
	    s1.display();  
	    s2.display();  
	   }  
	}