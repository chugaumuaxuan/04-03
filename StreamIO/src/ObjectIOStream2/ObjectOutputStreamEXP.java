package ObjectIOStream2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEXP {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("C:/Users/Admin/Desktop/txt5.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		Student st1 = new Student("Nguyen", 12);
		Student st2 = new Student("Pham", 22);
		
		Student[] studentArray = new Student[] {st1, st2};
		
		oos.writeInt(studentArray.length);
		
		for(Student s: studentArray) {
			oos.writeObject(s);
		}
		oos.close();
		
	}
}
