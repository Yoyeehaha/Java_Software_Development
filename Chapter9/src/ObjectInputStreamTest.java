
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\JAVA\\Chapter9\\src\\output2.txt"));
			
			int num = ois.readInt();
			System.out.println("num" + num);
			
			Student student = (Student)ois.readObject();
			System.out.println("Student name=" + student.getName());
			System.out.println("Student age=" + student.getAge());
			ois.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
