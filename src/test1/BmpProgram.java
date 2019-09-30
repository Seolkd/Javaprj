package test1;

import java.io.FileInputStream;
import java.io.IOException;

public class BmpProgram {

	public static void main(String[] args) throws IOException {

		// ===========로드=================
		FileInputStream fin = new FileInputStream("res/image.bmp");

		byte[] buf = new byte[10];
		fin.read();
		fin.close();
		// 재사용 재사용
		// 객체지향,함수,

		// ==========파일 크기 얻는 작업================
		fin.read(buf);
		int size = ((int) buf[2] & 0xff) << 0 | ((int) buf[3] & 0xff) << 8 | ((int) buf[4] & 0xff) << 16
				| ((int) buf[5] & 0xff) << 24;

		// ========파일 크기 출력==============
		System.out.printf("size:%d\n", size);

	}
}
