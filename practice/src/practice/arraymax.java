package practice;
public class arraymax {
	public static void main(String[] args) {
		int arr[]= {5,6,9,3,5,19};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
		max=arr[i];
		}
	}
	System.out.println("maximum number"+max);}
}
