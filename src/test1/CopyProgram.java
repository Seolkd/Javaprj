package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("res/image.bmp");
		FileOutputStream fos = new FileOutputStream("res/image1.bmp");
		
		byte[] buf = new byte[1024];
		int size = 0;
		while ((size = fin.read(buf)) != -1) {
			fos.write(buf,0,size);
			
		}
		System.out.println("복사완료");
		fin.close();
		fos.close();

	}

}
