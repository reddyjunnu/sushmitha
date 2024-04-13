package test;

public class Duplicatenumber {
	public static void main(String[] args) {
		int arr[]= {8,9,4,7,3,2,5,8,9};
		System.out.println("Duplicate numbers is given in an array;");
			for(int i=0;i < arr.length;i++ ) {
				for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
				}
			}
	}
}
