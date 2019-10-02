package 수레드;

public class Program {
	public static void main(String[] args) {
		//CRUD -> Retrive(select), /Create(insert), Update, Delete
		
		ObjectList list = new ObjectList();
		for (int i = 0; i < 10; i++) 
			list.add(i+1);
			
			new Thread(()-> {
				list.remove(8);
				list.print();
			}).start();
			
			list.print();
			
		
	}
}
//함수가 시작될 때부터 끝날 때 까지 건들지 마!!
//