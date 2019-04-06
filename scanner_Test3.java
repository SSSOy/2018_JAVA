//2. 국어, 영어, 수학 점수 입력받아 총점, 평균 출력
import java.util.*;

class scanner_Test3 {
	public static void main(String ar[]) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int ma = sc.nextInt();
		int eng = sc.nextInt();
		a = kor + ma + eng;
		b = a / 3;
		System.out.println("세 과목 점수의 합 : " + a);
		System.out.println("평균 : " + b);
	}
}