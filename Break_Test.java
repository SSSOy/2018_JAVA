//1���� 100���� ���ذ��µ� ���� 100�� �Ѵ� ������ ���� ���ϱ�
class Break_Test {
	public static void main(String ar[]) {
		int i = 1; 
		int sum = 0;
		while(true) {
			sum += i;
			if(sum >= 100){
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}