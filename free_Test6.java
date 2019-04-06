import java.util.*;

class free_Test6 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("x와 y를 입력하세요 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if((x >= 50 && x <= 100) && (y >= 50 && y <= 100))
			System.out.println("직사각형 안에 있습니다.");
		else 
			System.out.println("직사각형 밖에 있습니다.");
	}
}