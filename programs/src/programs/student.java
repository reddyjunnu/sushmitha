package programs;
import java.io.Serializable;
import java.io.*;
public class student implements Serializable {
	int id;
	String name;
	public student(int id,String Name){
	this.id=id;
	this.name=name;
}
}
class Persist{
public static void main(String[] args) {
try {
	student s1=new student(202,"sushmitha");
	FileOutputStream fout=new FileOutputStream("C:\\junnu\\testout.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("success");
	}catch(Exception e) {System.out.println(e);}
}
}
