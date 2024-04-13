package chitti;
 //declare add method with 2 parameters return type of method is float and add those 2 
//parameters and return that result to your main()method and print the o/p.
public class classadd {     
		float add(int a, int b) {
		int c = a+b;
           return c;
		}
		public static void main(String[] args) {
			float f=new classadd().add(2, 8);
			System.out.println(f);
		}
}
		
		