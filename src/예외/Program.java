package 예외;

//응용프로그램
public class Program {
	public static void main(String[] args) {

//		FileInputStream fis;
//		fis.read();
		try {
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.println(sum);
		} catch (너무커서반환할수없는예외 e) {
			System.out.println("aaa"+e.getMessage());
			//파일을 닫아야 하는 코드

		} catch (Exception aaa) {
			System.out.println("죄송합니다. \n" + "얘기치 않게 오류가 발생하였습니다.");
			//파일을 닫아야 하는 코드
		}
		
		finally {
			//어떤 예외가 발생하든 꼭 거쳐가는 코드
			System.out.println("Finally...");
		}
		
		System.out.println("종료되었나?");
	}
}
