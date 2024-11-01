
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStreamTest {

	public static void main(String[] args) {
		
		Student student = new Student("Hacker", 20);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\JAVA\\Chapter9\\src\\output2.txt"));
			
			oos.writeObject(student);
			oos.writeInt(123);
			oos.flush();
			oos.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
