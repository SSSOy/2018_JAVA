import java.util.*;

class Book3 {
	String number, title, author;

	public void setNumber(String number){
		this.number = number;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getNumber(){
		return this.number;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getLateFees(int price, int day) {
		return price * day;
	}
	public int getLateFees(int day) {
		return day;
	}
}

class Novel extends Book3 {
	int price = 300;
	public int getLateFees(int day) {
		return super.getLateFees(price, day);
	}
}
class poet extends Book3 {
	int price = 200;
	public int getLateFees(int day) {
		return super.getLateFees(price, day);
	}
}
class ScienceFiction extends Book3 {
	int price = 600;
	public int getLateFees(int day) {
		return super.getLateFees(price, day);
	}
}

class Book3_Test {
	public static void main(String ar[]) {
		
		Scanner sc = new Scanner(System.in);
		Book3 b[] = new Book3[3];
		int result[] = new int[3];
		b[0] = new Novel();
		b[1] = new poet();
		b[2] = new ScienceFiction();

		for(int i = 0; i < 3; i++) {
			System.out.print("연체 일 입력 : ");
			System.out.println("금액 : " + b[i].getLateFees(sc.nextInt()));
		}
	}
}