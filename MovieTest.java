class Movie {
	String name, director, producer;

	public Movie() { }
	public Movie(String name, String director, String producer) {
		this.name = name;
		this.director = director;
		this.producer = producer;
	}

	public void show() {
		System.out.println("���� : " + name);
		System.out.println("���� : " + director);
		System.out.println("���ۻ� : " + producer);
	}
}
class MovieTest {
	public static void main(String ar[]) {
		Movie m = new Movie("�Ű��Բ�", "���ȭ", "�Ե��������θ�Ʈ");

		m.show();
	}
}