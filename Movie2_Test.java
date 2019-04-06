import java.util.*;

class Movie2 {
	private String title, director, maker;

	public Movie2() { }
	public Movie2(String title, String director, String maker) {
		this.title = title;
		this.director = director;
		this.maker = maker;
	}
	public Movie2(String title, String maker) {
		this.title = title;
		this.maker = maker;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getTitle() {
		return this.title;
	}
	public String getDirector() {
		return this.director;
	}
	public String getMaker() {
		return this.maker;
	}
	public void show() {
		System.out.println("�� �� : " + this.getTitle());
		System.out.println("�� �� : " + this.getDirector());
		System.out.println("���ۻ� : " + this.getMaker());
		System.out.println("");
	}
}
class Movie2_Test {
	public static void main(String ar[]) {
		Movie2 m1 = new Movie2();
		Movie2 m2 = new Movie2("�ظ�����" , "Chris Columbus" , "1492 Pictures");
		
		m1.setTitle("���̾��");
		m1.setDirector("Jon Favreau");
		m1.setMaker("ABC");
		
		m1.show();
		m2.show();
	}
}


		