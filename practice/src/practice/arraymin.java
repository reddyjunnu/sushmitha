package practice;

public class arraymin {
	public static void main(String[] args) {
		int arr[]= {3,4,6,7,8,9,10};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		}
			System.out.println("maximum element"+min);
	}
}
	