import java.util.*;
//1���� 100���̿� ����
class up_Down {
	public static void main(String ar[]) {
		Random r = new Random();
		int no = r . nextInt(100);
		Scanner sc = new Scanner(System.in);

		for(int i = 1; i <= 10; i++){

			System.out.print("���� �Է� (1 ~ 100) : ");
			int num = sc . nextInt();
			if(num > 100){
				System.out.println("100 ������ ���ڸ� �Է��Ͻÿ�.");
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