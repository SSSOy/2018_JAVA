class Music {
	private String title, composer, singer;
	private int year, age;

	public Music(String title, String composer, String singer, int year, int age) {
		this.title = title;
		this.composer = composer;
		this.singer = singer;
		this.year = year;
		this.age = age;
	}
	public Music(String title, String singer, int year, int age) {
		this.title = title;
		this.singer = singer;
		this.year = year;
		this.age = age;
	}
	public Music(String title, String composer, String singer, int year) {
		this.title = title;
		this.composer = composer;
		this.singer = singer;
		this.year = year;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}

	public static void main(String ar[]) {
		Music m1=new Music("c","cc","Mike",2011,30);
		Music m2=new Music("d","Alice",2017,25);
		Music m3=new Music("e","ee","Tom",2018);

		m3.setAge(27);
		System.out.println("m3.age : " + m3.getAge());
	}
}