package test1.함수;

import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args)  {

		// 데이터
		int[] lotto = new int[6];

		// 기능(알고리즘)
		printMenu();
		switch (inputMenu()) {
		case 1:
			inputLottoManual(lotto);
			break;
		case 2:
			genLottoAuto(lotto);
			break;
		case 3:
			exitProgram();
		default:
			errorMessage();
		}

	}

	private static void errorMessage() {
		// TODO Auto-generated method stub
		
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		
	}

	private static void genLottoAuto(int[] lotto) {
		// TODO Auto-generated method stub
		
	}

	private static void inputLottoManual(int[] lotto) {
		// TODO Auto-generated method stub
		
	}

	private static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	//	System.out.println(num);
		return num;
	}

	private static void printMenu() {
		System.out.println("┌────────────────────┐");
		System.out.println("│  신이내린번호                  │");
		System.out.println("│  Lotto  Generator  │");
		System.out.println("│        최신A.I.탑재    │");
		System.out.println("└────────────────────┘");
		System.out.println("당신이 이번주 주인공!\n원하시는 메뉴를 입력하세요!!");
		System.out.println("\t1. 수동입력\n\t2. 자동입력\n\t3. 종료");
				
	}
}
