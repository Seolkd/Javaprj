package test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
//		System.out.write('2'+1);
//		System.out.write(51);
//		System.out.flush();
		
		//FileOutputStream fout = new FileOutputStream("res/text.txt");
		
//		fout.write('1');
//		fout.write('2');
//		fout.flush();
		
		FileOutputStream fout = new FileOutputStream("res/text-bi.txt");
		
		fout.write(12);
		fout.flush();
		fout.close();
		
		// 1. 파일 입력 스트림 fin 객체를 생성할 것.
//		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\JavaPrj\\src\\res\\image.bmp");
		//절대경로 : 지구 - 아시아 - 대한민국 - 서울 - 성북구 - 종암동 - 아이파크 
		FileInputStream fin = new FileInputStream("res/image.bmp");
		//상대경로 : (내가 서울에 있으니) 성북구 - 종암동 - 아이파크
		//상대경로 : 실행파일이 있는 경로로부터의 경로

		// 2. 파일에서 첫 번째 1바이트를 읽어서 출력할 것.
		int value = fin.read();
	
	//	System.out.println(value);
		// 3. 파일입력 스트림을 닫을 것.

		fin.close();
	}

}

