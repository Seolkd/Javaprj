package test1.함수;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class APIProgram {

	public static void main(String[] args) throws IOException {
		//System.out;
		//자료형식
		//연산자(산술,비교,관계,비트)
		//제어구조(if,else,elseif,switch,for,while,do-while)
		//+
		//입/출력도구(API): 콘솔,파일
		
		//배열
		
		//system.in;
		
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fos = new FileOutputStream("res/api-out.txt");
		PrintStream fout = new PrintStream(fos);
		
		int b1 = System.in.read();
		System.out.println(b1);
		
		int b2 = fin.read();
		fout.println(b2);
		
		
		
//		int kor = 90;
//		int eng = 80;
//		
		fin.close();
//		
//		System.out.printf("kor:%d, eng:%d\r\n",kor,eng);
//		//System.out.print("\r\n");
//		System.out.print("end");
//		
//		
//		
//		fout.printf("kor:%d, eng:%d\r\n",kor,eng);
//		//fout.print("\r\n");
//		fout.print("end");
		fout.close();
		fos.close();
		

	}

}
//모든 입출력의 기본값은 코드값이다.
//싱글쿼테이션을 넣으면 문자코드로 인식한다.
//다른 객체를 활용하는 객체 -> 응용객체
//걔를 넘겨받아서 활용환다.
//프린트함수 3가지
