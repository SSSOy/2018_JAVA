import java.util.*;

class Rock_Scissor_Paper {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작! (가위/바위/보 중 한개 입력)");
		System.out.print("철수 : ");
		String c = sc.next();
		System.out.print("영희 : ");
		String y = sc.next();

		switch(c) {
		case "가위" : 
			switch(y){
				case "가위" :
					System.out.println("비겼습니다.");
					break;
				case "바위" :
					System.out.println("영희가 이겼습니다.");
					break;
				case "보" :
					System.out.println("철수가 이겼습니다.");
					break;
				default :
					System.out.println("잘못 입력하셨습니다");
					break;
			}
			break;
		case "바위" :
			switch(y){
				case "가위" :
					System.out.println("철수가 이겼습니다.");
					break;
				case "바위" :
					System.out.println("비겼습니다.");
					break;
				case "보" :
					System.out.println("영희가 이겼습니다.");
					break;
				default :
					System.out.println("잘못 입력하셨습니다");
					break;
			}
			break;
		case "보" :
			switch(y){
				case "가위" :
					System.out.println("영희가 이겼습니다.");
					break;
				case "바위" : 
					System.out.println("철수가 이겼습니다.");
					break;
				case "보" :
					System.out.println("비겼습니다.");
					break;
				default :
					System.out.println("잘못 입력하셨습니다");
					break;
			}
			break;
			default :
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}
}	 