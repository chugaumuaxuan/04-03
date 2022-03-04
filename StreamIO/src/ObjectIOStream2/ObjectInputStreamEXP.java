package ObjectIOStream2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEXP {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream("C:/Users/Admin/Desktop/txt5.txt");
		
		ObjectInputStream ois = new ObjectInputStream(is);
		
		int studentCount = ois.readInt();
		for(int i = 0; i < studentCount; i ++) {
			Student s = (Student) ois.readObject();
			System.out.println(s.getName() + " " + s.getAge());
		}
		ois.close();
	} 
}
