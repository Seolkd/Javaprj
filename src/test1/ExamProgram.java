package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("res/data.txt");
		Scanner fscan = new Scanner(fin);

		int[] nums = new int[100];

		// 데이터 일괄 로드(load)

		for (int i = 0; fscan.hasNext(); i++) {
			nums[i] = fscan.nextInt();
			nums[i + 1] = -1;
		}

		fin.close();
		//데이터는 로드 되었다.

		//데이터 개수
		int count = 0;
		
		for(int i = 0; nums[i] !=-1; i++) count++;
		
		//데이터 합
		int sum = 0;
		for (int i=0; nums[i] != -1 ; i++) sum+=nums[i];
			
		//데이터평균	
		double avg = 0;
		avg = (double)sum / count;
		
		System.out.printf("sum:%d\n",sum);
		System.out.printf("avg:%f\n",avg);

		fscan.close();
	}
}
