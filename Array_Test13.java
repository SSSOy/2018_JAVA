import java.util.*;
class Array_Test13 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

		int a[] = new int[ 5 ];
		System.out.println("��� �Ǵ� ������ 5�� �Է��Ͻÿ� : ");
		for(int i = 0; i < a.length; i++){
			a[ i ] = sc.nextInt();
			if(a[ i ] < 0)
				a[ i ] *= -1;
		}
		for(int i = 0; i < a.length; i++)
			System.out.println(a[ i ]);
	}
}	