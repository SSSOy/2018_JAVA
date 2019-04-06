class Movie {
	String name, director, producer;

	public Movie() { }
	public Movie(String name, String director, String producer) {
		this.name = name;
		this.director = director;
		this.producer = producer;
	}

	public void show() {
		System.out.println("제목 : " + name);
		System.out.println("감독 : " + director);
		System.out.println("제작사 : " + producer);
	}
}
class MovieTest {
	public static void main(String ar[]) {
		Movie m = new Movie("신과함께", "김용화", "롯데엔터테인먼트");

		m.show();
	}
}