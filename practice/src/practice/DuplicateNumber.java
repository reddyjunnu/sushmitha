package practice;

public class DuplicateNumber {
	public static void main(String[]args) {
		 int [] arr = {3,6,8,9,3,6,8,5,7,10};  
		 System.out.println("Duplicate elements in given array: ");  
		 for(int i = 0 ;i < arr.length; i++) {  
			 for(int j = i + 1; j < arr.length; j++) { 
				 if(arr[i] == arr[j])  
					 System.out.println(arr[j]);  
			 }
		 }
	}
}
			   