//1 . n을 입력받아 1 ~ n까지의 5의 배수 갯수 출력
import java.util.*;

class Do_While_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int i = 1;
		int a = 0;
		do{
			if(i % 5 == 0){
				a++;
			}
			i++;
		}while(i <= n);
		System.out.println("1부터 n까지의 5의 배수 갯수는 " + a +"개 입니다.");
	}
}