package test;
public class armstrong {
	public static void main(String[] args) {
		int sumOfCube=0,a,temp;
		int number=153;
		temp=number;
		while(number>0)    
	    {    
	        a=number%10; 
	        number=number/10;   
	        sumOfCube=sumOfCube+(a*a*a);
	    }    
	    if(temp==sumOfCube)    
	        System.out.println(temp+" is an armstrong number");     
	    else    
	        System.out.println(temp+ "is not an armstrong number");     
	}
		
	}


