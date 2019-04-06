import java.util.*;
//1부터 100사이에 랜덤
class up_Down {
	public static void main(String ar[]) {
		Random r = new Random();
		int no = r . nextInt(100);
		Scanner sc = new Scanner(System.in);

		for(int i = 1; i <= 10; i++){

			System.out.print("숫자 입력 (1 ~ 100) : ");
			int num = sc . nextInt();
			if(num > 100){
				System.out.println("100 이하의 숫자를 입력하시오.");
				i--;
				continue;
			}
			else if (num == no){
				System.out.println("You Win!!");
				break;
			}
			else if (i == 10) {
				System.out.println("You Lose!!");
				break;
			}
			else if (num < no){
				System.out.println(" Up ");
			}
			else if(num > no){
				System.out.println(" Down ");
			}
		}
	}
}