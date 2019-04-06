import java.util.*;

class Array_Test3 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		String s[ ] = new String[ 5 ];
		for(int i = 0; i < 5; i++){
			System.out.print("이름 입력 : ");
			s [ i ] = sc.next();
		}
		for(int i = 0; i < 5; i++)
			System.out.println(s [ i ]);
	}
}