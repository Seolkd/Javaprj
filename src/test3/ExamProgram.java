package test3;

public class ExamProgram {
	public static void main(String[] args) {

		//Exam exam; // 이름표딱지(공간X)
		Exam exam = new Exam(); // 객체를 만드는 연산(공간생성)
		// 이름표없이 객체를 쓸 수 없고, 객체 없이 이름표만으로 쓸 수 없다.
	//	Exam exam = new Exam(10,10,10); // 객체를 만드는 연산(공간생성)
		//초기화를 강제할 수 없음.
		//Exam.input(exam); // 성적(를) 입력 // 함수지향
		exam.input(); // 객체지향
		
	//	Exam.print(exam);
		exam.print();// 성적(를) 출력

	}

}
