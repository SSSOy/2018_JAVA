//3. 임의의 점수 입력, 60점 이상이면 합격, 아니면 불합격
import java.util.*;

class scanner_Test4 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
