package 가변배열;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
//		ObjectList list = new ObjectList();
		GList<Exam> list = new GList();
		//모든 것을 담는 것은 단점일 수 있다.
//		list.add("Hello");
//		list.add(30);
		list.add(new Exam());
		
		//서비스 함수를 사용하려면? 형식을 변환해야 한다.
		//list.get(2).input();
//		list.get(2).input();
		
		
//		템플릿클래스 = 자료형식을 바꿀 수 있는 클래스
		//컬렉션클래스
//		ObjectList list;
////		Object[] data = new Object[3];
////		int index = 0;
//		list = new ObjectList();
//		int exit=0;
//		Scanner scan = new Scanner(System.in);
//		do {
//			input(list); //data는 참조전달, index는 값 전달
//			
//			print(list);
//			System.out.print("go?(1 or 0):");
//			exit = scan.nextInt();
//		}while(exit != 1);
	}

	private static void print(ObjectList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("kor:%d\n", list.get(i));
		}
	}

	private static void input(ObjectList list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kor:");
		
		list.add(scan.nextInt());
//		data[index] = scan.nextInt();
//		index++;
	}
}
