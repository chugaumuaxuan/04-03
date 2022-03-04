package FileIOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEXP {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/Admin/Desktop/txt3.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		int code;
		while((code = fis.read()) != -1) {
			System.out.println((char)code);
		}
		fis.close();
	}
}
