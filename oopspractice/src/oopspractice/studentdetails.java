package oopspractice;
public class studentdetails {
	int rollNo;
	String name;
	String addr;
}
class abc extends studentdetails{
	long phno;
	String email;
}
class main{
	public static void main(String[] args) {
		abc obj=new abc();
		obj.rollNo=202;
		obj.name="chitti";
		obj.addr="siddipet";
		obj.phno=996391859;
		obj.email="chitti@gmail.com";
		System.out.println("obj");
	}
		

}
