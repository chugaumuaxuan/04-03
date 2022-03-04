package Buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferInputStreamEXP {
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:/Users/Admin/Desktop/txt2.txt");
		
		BufferedInputStream bis = new BufferedInputStream(is, 16034);
		
		int code;
		while((code = bis.read()) != -1) {
			System.out.println((char)code);
		}
		bis.close();
	}
}
