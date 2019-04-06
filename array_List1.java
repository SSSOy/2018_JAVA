//ArrayList, Hash Map 은 Collection Interface 의 자식

import java.util.*;

class array_List1 {
	public static void main(String ar[]) {
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Integer> list = new ArrayList<Integer>();

		//1. 삽입(add(e), add(index e), addAll())
		list.add("사과");
		list.add("딸기");
		list.add("멜론");
		list.add("포도");
		list.add("복숭아");
		list.add(2, "바나나");
		list.add(5, "수박");

		//출력
		
		/*System.out.println(list);
		for(String fruit : list)		
			System.out.println(fruit);
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));*/
			
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s + "\t");
		}
	}
}