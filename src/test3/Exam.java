package test3;

import java.util.Scanner;

public class Exam {
	private int kor = 1;
	private int eng;
	private int math;

	public Exam() {
		this(0, 0, 0);

	}

	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// (접근지정자)(반환타입)(클래스명)(변수타입)(변수)
	public static void input(Exam exam) {
		System.out.printf("국어성적를 입력하라 : ");
		Scanner korIn = new Scanner(System.in);
		exam.kor = korIn.nextInt();

	}

	public void input() {
		System.out.printf("국어성적를 입력하라 : ");
		Scanner korIn = new Scanner(System.in);
		this.kor = korIn.nextInt();

	}

	public static void print(Exam exam) {
		System.out.printf("입력한국어성적 : %d\n", exam.kor);
	}

	public void print() {
		System.out.printf("입력한국어성적 : %d\n", this.kor);
	}
}
