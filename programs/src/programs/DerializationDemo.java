
package programs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
public class DerializationDemo {
	public static void main(String[] args) {
		String fileName = "c:\\junnu\\Testfile.txt";
		try {
			FileInpuStream fis = new DerializationDemo();
			ObjectInputStream ois = new ObjectIputStream(fis);
			Student obj = (Student)ois.readObject();
			System.out.prinln(obj.stuRollNo);
			System.out.prinln(obj.stuName);
			ois.close();
			fis.close();
		}catch(FileNotFoundException e) {
			
		}
	}
	
}
