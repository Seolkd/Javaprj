package test1.함수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		int[] nums = new int[10];

		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\JavaPrj\\res\\data.txt");
		Scanner fscan = new Scanner(fin);
		int num = 0;
		int sum = 0;
		int avr = 0;
		int cnt = 0;

		while (fscan.hasNext()) { //fscan이 다음값이 있다면(hasNext)
			cnt += 1; //cnt에 1을 더한다.
			num = fscan.nextInt(); //fscan의 다음값을 num에 대입한다.
			sum += num; //num과 sum을 합한 값을 sum에 넣는다.
			avr = sum/cnt; // sum을 cnt로 나눈 값을 avr에 넣는다 - !!!!!!평균계산은 마지막에~~ 다음엔 while문 바깥으로 빼자.
		//	System.out.println(num);
		}
		System.out.println(sum); // sum의 값을 콘솔에 출력
		System.out.println(avr); // avr의 값을 콘솔에 출력
		fscan.close(); // Scanner 종료
		fin.close(); // FileInputStream 종료
	}//main method end

} //class end


//합과 평균
//언어 + 도구(입/출력)[콘솔,파일UI껍데기(웹, 윈도우,3D)]
