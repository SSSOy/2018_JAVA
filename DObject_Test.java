import java.util.*;

abstract class DObject {
	abstract public void draw();
}

class Figure extends DObject {
	String type;

	public void draw() {
		switch(type) {
			case "Line" : 
				System.out.println("Line");
				break;
			case "Circle" :
				System.out.println("Circle");
				break;
			case "Rect" :
				System.out.println("Rect");
		}
	}
}
class Menu1 {
	Scanner sc = new Scanner(System.in);
	
	Figure f[] = new Figure[10];

	public Menu1() {
		for(int i = 0; i < f.length; i++) 
			f[i] = new Figure();
	}
	public void Insert(int i) {
		System.out.print("도형종류    Line( 1 )   Rect( 2 )   Circle( 3 )   : ");
		int n = sc.nextInt();
		
		switch(n) {
			case 1 : 
				f[i].type = "Line";
				break;
			case 2 : 
				f[i].type = "Rect";
				break;
			case 3 : 
				f[i].type = "Circle";
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void Delete(int c) {
		System.out.print("몇 번째를 삭제하시겠습니까?   : ");
		int n = sc.nextInt();
		if(c < n) 
				System.out.println("잘못 입력하셨습니다.");
		if(f[n-1].type == "")
			System.out.println("삭제 할 데이터가 없습니다.");
		f[n-1].type = "";
	}
	public void view(int count) {
		for(int i = 0; i < count; i++) 
			f[i].draw();
	}
	public void Exit() {
		System.exit(0);
	}
}

class DObject_Test {
	public static void main(String ar[]) {
		Scanner sc =  new Scanner(System.in);
		Menu1 m = new Menu1();
		int number;
		int count = 0;

		while(true) {
			System.out.print("입력[ 1 ]     삭제[ 2 ]     출력[ 3 ]     종료[ 4 ]     : ");
			number = sc.nextInt();
			
			switch(number) {
				case 1 : 
					m.Insert(count);	
					count++;				break;
				case 2 :
					m.Delete(count);			break;
				case 3 : 
					m.view(count);		break;
				case 4 : 
					m.Exit();				break;
				default : 
					System.out.println("잘못  입력하셨습니다.");
			}
		}
	}
}