package 가변배열;

public class GList<명훈> {
	private 명훈[] data;
	private int index;
	private int max;

	public GList() {
		// 생성자 만들기
		this.data = (명훈[])new Object[3];
		this.index = 0;
		max=3;
	}

	public int size() {

		return index;
	}

	public void add(명훈 value) {
		
		if(index>=max) { //if 저장할 공간이 없다면 공간 늘려주기
		/*
		 * 공간 늘려주기
		 * 1. 이주할 Object 형식(여기서는 배열)을 max+5 크기로 temp를 생성.
		 * 2. data 배열의 값을을 temp로 옮긴다.
		 * 3. temp배열의 이름을 data라는 이름으로 변경한다.
		 * 4. max의 의 값을 +5 증가시킨다.
		 */
			명훈[]temp = (명훈[])new Object[max+5];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data=temp;			
			max=max+5;
			
			
		}
		data[index] = value;
		index++;
	}

	public 명훈 get(int i) {
		
		return data[i];
	}
}
