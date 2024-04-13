package programs;
import java.io.FileInputStream;
public class FileInputStreamExample {
	public static void main(String[] args) {
		try(FileInputStream fileOutputStream = new FileInputStream("c:\\junnu\\testout.txt")) {
			String msg = "welcome java";
			byte byteArray[]=msg.getBytes();
			fileOutputStream.read(byteArray);
			System.out.println("success");
		}catch (Exception e) {System.out.println(e);}
	}
}
