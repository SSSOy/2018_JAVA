//ArrayList, Hash Map �� Collection Interface �� �ڽ�

import java.util.*;

class array_List1 {
	public static void main(String ar[]) {
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Integer> list = new ArrayList<Integer>();

		//1. ����(add(e), add(index e), addAll())
		list.add("���");
		list.add("����");
		list.add("���");
		list.add("����");
		list.add("������");
		list.add(2, "�ٳ���");
		list.add(5, "����");

		//���
		
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