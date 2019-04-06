import java.util.*;

class free_Test5 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자 1개 입력 : ");
		char c = sc.next().charAt(0);
	
		if(c >= 65 && c <= 90)
			System.out.println("대문자 입니다.");
		else if(c >= 97 && c <= 122)
			System.out.println("소문자 입니다.");
		else 
			System.out.println("잘못 입력했습니다.");
	}
}