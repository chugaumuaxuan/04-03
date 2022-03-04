package ByteArray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEXP {
	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
		
		byte[] byte1 = new byte[]{'H' , 'E'};
		
		baos.write(byte1);
		baos.write('L');
		baos.write('L');
		baos.write('0');
		
		byte[] buffer = baos.toByteArray();
		
		for(byte b: buffer) {
			System.out.println((char)b);
		}
		
		baos.close();
	}
}
