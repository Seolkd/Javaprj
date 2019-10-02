package 수레드;

public class ObjectList {

	private Object[] data;
	private int index;
	
	public ObjectList() {
		data = new Object[3];
		index = 0;
	}

	public int size() {
		return index;
	}

	public void add(Object value) {
		if(index >= data.length) {
			Object[] temp = new Object[data.length + 3];
			
			for(int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}
		
		data[index] = value;
		index++;
		
	}

	public Object get(int index) {
		
		return data[index];
	}

	public /*synchronized*/ void print() {
		Thread th = Thread.currentThread();
		synchronized(data) {
		int size = index;
		for(int i = 0; i <size; i++)
			System.out.println("data : " + data[i] + " / Thread ID : " + th.getId());
		}
	}

	public synchronized void remove(int index) {
		//삭제될 index 보다 큰 위치의 값을 한칸씩 옮기는 작업
		int count = size() - index -1;
		
		for (int i = 0; i < count; i++) {
			data[index+i] = data[index+1+i];	
		}
		
		//배열의 제일 끝의 값을 null로 수정
		data[--this.index] = null;
	}

}
