//�� ���� ������ �Է¹޾� �� ���� ������ 3�� ����̰ų� 7�� ����� ������ �հ� ��� ���ϱ�

class Param_Test6 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		int sum = 0, a = 0, temp;
		float avg;
		
		if(n > m) {
			temp = n; 
			n = m; 
			m = temp;
		}

		for(int i = n; i <= m; i++){
			if(i % 3 == 0 || i % 7 == 0){
				sum += i;
				a++;
			}
		}
		avg = sum / a;

		System.out.println("�� : " + sum + ", ��� : " + avg);
	}
}