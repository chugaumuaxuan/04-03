package FileIOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEXP {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/Admin/Desktop/txt3.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write("Hello World".getBytes("UTF-8"));
		fos.close();
	}
}
