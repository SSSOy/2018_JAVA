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
			System.out.print("뺌~ ");
	}
}

class 	StarCreft_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);

		Zerg z = new Zerg(0, 0, "주황");

		while(true) {

			System.out.print("가로로 몇칸 움직이시겠습니까? (왼쪽은 음수입력) : ");
			int x = sc.nextInt();
			System.out.print("세로로 몇칸 움직이시겠습니까? (아래쪽은 음수입력) : ");
			int y = sc.nextInt();
			System.out.print("몇 번 공격하겠습니까? : ");
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

			System.out.print("종료하려면 0 입력 : ");
			int stop = sc.nextInt();
			if(stop == 0)
				break;
		}
	}
}