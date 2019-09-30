package game.shooting;

import java.awt.Frame;

public class Program {
	public static void main(String[] args) {

//		class A implements Runnable { //단순하게 이것(임플리먼트)만 딱 한번 사용하고 말라고 메인 안에다가 클래스를 만듦
//			@Override
//			public void run() {
//				printList();
//			}
//		}
//		// 위와 아래는 같다. 클래스를 새로 생성했다가 없어지니까 함수만 구현하는 것이 목적이라면 그냥 선언할 때 인터페이스를 구현해버린다. 
//		Thread th = new Thread(new Runnable() { 
//			@Override
//			public void run() {
//				printList();
//
//			}
//		}); // 새로운 줄기를 만든다.
//		Thread th = new Thread(()->printList());
//		th.start(); // 시작을 나타내는 함수
//		Thread th2 = new Thread(()->printList());
//		th2.start(); // 시작을 나타내는 함수
//		
		 Frame frame = new GameFrame();

//		for (int i = 0; i < 100; i++)
//			System.out.printf("main : %d\n", i + 1);

	}

//	private static void printList() {
//		for (int i = 0; i < 100; i++) {
//			System.out.printf("sub : %d\n", i + 1);
//
//		}
//	}
}
