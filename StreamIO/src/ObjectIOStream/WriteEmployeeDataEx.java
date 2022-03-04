package ObjectIOStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class WriteEmployeeDataEx {

	    public static void main(String[] args) throws IOException {
	        File outFile = new File("C:/Users/Admin/Desktop/txt4.txt");


	        Employee e1 = new Employee("Tom", 1000f);
	        Employee e2 = new Employee("Jerry", 2000f);
	        Employee e3 = new Employee("Donald", 1200f);

	        Employee[] employees = new Employee[] { e1, e2, e3 };

	        OutputStream os = new FileOutputStream(outFile);
	        ObjectOutputStream oos = new ObjectOutputStream(os);

	        oos.writeInt(employees.length);

	        for (Employee e : employees) {
	            oos.writeObject(e);
	        }
	        oos.close();
	    }
}
