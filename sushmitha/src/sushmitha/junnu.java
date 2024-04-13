package sushmitha;
public class junnu {
	int a=3;
	int b=4;
 
		public static void main(String[] args) {
		junnu obj= new junnu();
		obj.b=5;
		new junnu().b=6;
		new junnu().a=8;
		new junnu().b=6;
		System.out.println(obj.a);
		System.out.println(new junnu().b);
		System.out.println(new junnu().b);
		}
}
