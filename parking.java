import java.util.*;

class parking {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);

		int d, h, m, a, mo = 0, mo2 = 0;
		System.out.print("��, �ð�, �� ���ʷ� �Է�(24�ð��� �ȳ��� ��� �Ͽ� 0�Է�)\n==>");
		d = sc.nextInt();
		h = sc.nextInt();
		m = sc.nextInt();
		a = h * 60 + m;

		mo2 = 2000;
		if(d > 0) {
			mo -= 2000;
			for(int i = 1; i <= d; i ++)
				mo += 8000;
		}
		for(int i = 1; i <= a / 10 - 12; i++) {
			mo2 += 200;
			if(mo2 >= 8000){
				mo2 = 8000;
				break;
			}
		}

		if(d == 0 && ((h < 2 && m < 60) || (h == 2 && m == 0)))
			mo = 2000;

		System.out.println("��������� " + (mo + mo2) + "�� �Դϴ�.");
	}
}