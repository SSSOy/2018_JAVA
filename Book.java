class Book {
	private String title, author, publish;
	private int price;
	
	public Book() { }
	public Book(String title, String author, String publish, int price) {
		this.title = title;
		this.author = author;
		this.publish = publish;
		this.price = price;
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book(String title, String publish) {
		this.title = title;
		this.publish = publish;
	}

	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}

	public static void main(String a[]) {
		Book b1=new Book("A","aa","aaa",100);
		Book b2=new Book("B","bbb");
		Book b3=new Book("C","cc", 200);
		Book b4=new Book();

		b4.setTitle("D");
		System.out.println("Title : " + b4.getTitle());
		b4.setAuthor("dd");
		System.out.println("Author : " + b4.getAuthor());
	}
}