package test1;

import test3.Exam;

public class TextProgram {
	public static void main(String[] args) {
		int x = 3;
		Integer a = 3;
		float y = 3.5f;
		char c = 'a';
		double d = 4.7d;
		Exam r = new Exam();
		
		Object[] data = new Object[5];
		data[0] = new Integer(x);
		data[1] = new Float(y);
		data[2] = new Character(c);
		data[3] = new Double(d);
		data[4] = r;
		
		int n = 3;
		String s = Integer.toString(n);
		
		//String p = n; // 문자열 p의 값에는 정수 n의 값을 넣을 수 없지만 인티저 투스트링을 해서 래핑하면 사용가능
		
		String p1 = String.valueOf(n);
		
		String s1 = "35";
		//int n1 = s1;
		int x1 = Integer.parseInt(s1);
		
		String kor_ = "40";
		String eng_ = "50";
		String math_ = "60";
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int math = Integer.parseInt(math_);
		
		int total = kor + eng + math;
		System.out.printf("total : %d \n",total);
		
		String name1 = "아이유";
		String name2 = new String("아이유");
		String name3 = "아이유";
		
		System.out.println("name1과 name2의 주소값 비교 : "+(name1 == name2)); // 주소값을 비교
		System.out.println("name1과 name3의 주소값 비교 : "+(name1 == name3));
		
		System.out.println("name1과 name2의 내용값 비교 : "+(name1.equals(name2))); //값을 비교
		System.out.println("name1과 name3의 내용값 비교 : "+(name1.equals(name3)));

		
		System.out.println("name1과 문자열 '아이유'의 주소값 비교 : "+(name1 == "아이유")); // true -> 상수형 객체는 하나만 만든다. 그래서 트루
		
		String fileName = "Photo.jpg";
		System.out.println("문자열의 길이 : "+fileName.length());
		System.out.println(".의 위치(문자열 어딘가의 위치)(0부터 시작) : "+fileName.indexOf("."));
		System.out.println("3번째 문자까지만 출력(0부터 시작) : "+fileName.substring(0, 3));
		
		
		System.out.println("포토만 출력 : "+(fileName.substring(0,fileName.indexOf("."))));
		
		String str = fileName.replace('o', 't');
		System.out.println("변형된 글자 o->t : "+str); //새로운 객체가 생성되었고 원본 객체는 손상되지 않는다.
		
	}
}
