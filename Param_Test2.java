//n,m을 입력받아 n부터 m까지 합 구하기
import java.util.*;

class Param_Test2 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		int sum = 0;

		for(int i = n; i <= m; i++)
			sum += i;
		System.out.println(sum);
	}
}