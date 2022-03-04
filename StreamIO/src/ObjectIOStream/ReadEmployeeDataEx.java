package ObjectIOStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReadEmployeeDataEx {

	    public static void main(String[] args) throws IOException, ClassNotFoundException {
	 
	        InputStream is = new FileInputStream("C:/Users/Admin/Desktop/txt4.txt");
	        ObjectInputStream ois = new ObjectInputStream(is);
	        
	        int employeeCount = ois.readInt();
	        
	        for(int i=0; i< employeeCount; i++) {
	            Employee e = (Employee) ois.readObject();
	            System.out.println( e.getFullName() +" " + e.getSalary());
	        }
	        ois.close();
	    }
}
