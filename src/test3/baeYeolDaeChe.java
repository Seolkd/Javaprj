package test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class baeYeolDaeChe {
	public static void main(String[] args) {
		
		
		//배열 ... 대체제... // 셋다 컬렉션(수집하는녀석) // 데이터를 식별하는 방법에 차이를 두고 있는 계열들
		//1. 데이터가 곧 식별자(key)다 => Set계열
		System.out.println("Set계열");
		Set set = new HashSet(); 
		set.add("hello");
		set.add(37);
		set.add("호호호");
		set.add(37);
		set.add("호호호"); // 키가 값과 같으니 중복을 제거
		
		for(Object obj : set)
			System.out.println(obj); //
		
		
		//2. 데이터의 순서가 곧 식별자(key)다 => List계열
		System.out.println("List계열");
		List list = new ArrayList(); //제일 많이 쓰는 계열
		list.add("hello");
		list.add(37);
		list.add("호호호");
		list.add(37);
		list.add("호호호");  // 저장된 값을 찾아라
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //리스트의 i번째(키)를 출력	
		}
		

		for(Object obj : list)
			System.out.println(obj);
		
		
		
		//3. 데이터의 식별자(key)가 따로 있다. => Map 계열
		System.out.println("Map계열");
		Map map = new HashMap();
		map.put("이름", "홍길동");
		map.put("나이", "17");
		map.put("주소", "한양");
		
		System.out.println(map.get("주소")); // 어떤 데이터를 임시로 만들어야 한다.
	//	for(k=0;map.keySet().length;k++)
			
		for(Object k : map.keySet()) //for each문 
			System.out.printf("key %s, value %s\n", k, map.get(k));
		
		//Generic 내일 진도
	}
}
