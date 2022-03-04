package Buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferOutputStreamEXP {
	public static void main(String[] args) throws IOException  {
		
		OutputStream os = new FileOutputStream("C:/Users/Admin/Desktop/txt2.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(os, 16034);
		
		bos.write("Hello World".getBytes("UTF-8"));
		bos.close();
	}
	
}
