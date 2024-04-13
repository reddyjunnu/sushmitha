package programs;
import java.io.FileOutputStream;
public class FileOutputStreamExample {
	public static void main(String[] args) {
		try(FileOutputStream fileOutputStream = new FileOutputStream("c:\\junnu\\testout.txt")) {
			String msg = "welcome java";
			byte byteArray[]=msg.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("success");
		}catch (Exception e) {System.out.println(e);}
	}
}
