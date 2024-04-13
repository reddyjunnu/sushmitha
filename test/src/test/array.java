package test;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,6,7};
		arr[0]=1;
		arr[1]=2;
		arr[2]=5;
		arr[3]=6;
		arr[4]=7;
		if(arr[3]==6)
		{
			System.out.println("4th position it is found");
		}
		else {
			System.out.println("4th position it is not found");
		}
	}
}