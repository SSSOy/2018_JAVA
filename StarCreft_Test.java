import java.util.*;

interface StarCreft {
	int MAX = 20;
	int MIN = 0;
	int STEP = 1;
	
	public void movableX(int n);
	public void movableY(int n);
	public void attackable(int n);
}

class Zerg implements StarCreft {
	int xPos = 0, yPos = 0;
	String color;

	public Zerg(int x, int y, String color) {
		this.xPos = x;
		this.yPos = y;
		this.color = color;
	}
	public void movableX(int n) {
		xPos += (n * STEP);
		if(xPos > MAX) 
			xPos -= (xPos - MAX);
		if(xPos < MIN) 
			xPos *= -1;
	}
	public void movableY(int n) {
		yPos += (n * STEP);
		if(yPos > MAX)  
			yPos -= (MAX - yPos); 
		if(yPos < MIN) 
			yPos *= -1; 
	}
	public void attackable(int n) {
		for(int i = 0; i < n; i++) 
			System.out.print("��~ ");
	}
}

class 	StarCreft_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);

		Zerg z = new Zerg(0, 0, "��Ȳ");

		while(true) {

			System.out.print("���η� ��ĭ �����̽ðڽ��ϱ�? (������ �����Է�) : ");
			int x = sc.nextInt();
			System.out.print("���η� ��ĭ �����̽ðڽ��ϱ�? (�Ʒ����� �����Է�) : ");
			int y = sc.nextInt();
			System.out.print("�� �� �����ϰڽ��ϱ�? : ");
			int n = sc.nextInt();

			z.movableX(x);
			z.movableY(y);

			for(int i = 0; i < (z.MAX - z.yPos); i++)
				System.out.println("");

			for(int i = 0; i < z.xPos; i++)
				System.out.print(" ");

			System.out.print("@@");
			z.attackable(n);

			if(y < 0)
				y *= -1;

			int q = (z.MAX - z.xPos) - (n * 3);
			for(int i = 0; i < q; i++) 
				System.out.print(" ");
			for(int i = 0; i < y; i++)
				System.out.println("");

			System.out.print("�����Ϸ��� 0 �Է� : ");
			int stop = sc.nextInt();
			if(stop == 0)
				break;
		}
	}
}