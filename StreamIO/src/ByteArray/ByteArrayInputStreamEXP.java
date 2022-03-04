package ByteArray;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEXP {
	public static void main(String[] args) {
		byte[] byteArray = new byte[]{84, 104, 105, 115, 32, 105, 115, 32, 116, 101, 120, 116};

		
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		
		int b;
		while((b = bais.read()) != -1) {
			System.out.println( (char) b );
		}
	}
	
}
