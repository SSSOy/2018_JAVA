//10���� ������ �Է¹޾� ¦���� ������ Ȧ���� ���� ���ϱ�

class Param_Test5 {
	public static void main(String ar[]){
		int n[] = new int[10];
		int a = 0, b = 0;

		for(int i = 0; i < n.length; i++){
			n[i] = Integer.parseInt(ar[i]);
			if(n[i] % 2 == 0)
				a++;
			else
				b++;
		}
		System.out.println("¦���� ���� : " + a);
		System.out.println("Ȧ���� ���� : " + b);
	}
}