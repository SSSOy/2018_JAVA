import java.util.*;

class Product {
	String id, info, consumer;
	int price;

	void setId(String id) {
		this.id = id;
	}
	String getId() {
		return id;
	}
	void setInfo(String info) {
		this.info = info;
	}
	String getInfo() {
		return info;
	}
	void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	String getConsumer() {
		return consumer;
	}
	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	
	void setTitle(String title) {}
	String getTitle() {return null;}
	void setAuthor(String author) {}
	String getAuthor() {return null;}
	void setIsbn(String isbn) {}
	String getIsbn() {return null;}
	void setLanguage(String language) {}
	String getLanguage() {return null;}
	void setAlbumTitle(String albumTitle) {}
	String getAlbumTitle() {return null;}
	void setSinger(String singer) {}
	String getSinger() {return null;}

	public void show() {
		System.out.println("상품 ID : " + this.getId());
		System.out.println("상품설명 : " + this.getInfo());
		System.out.println("생산자 : " + this.getConsumer());
		System.out.println("가격 : " + this.getPrice());
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////
class Book2 extends Product {
	String title, author, isbn;
	
	void setTitle(String title) {
		this.title = title;
	}
	String getTitle() {
		return title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	String getAuthor() {
		return author;
	}
	void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	String getIsbn() {
		return isbn;
	}
	public void show() {
		super.show();
		System.out.println("책 제목 : " + this.getTitle());
		System.out.println("저자 : " + this.getAuthor());
		System.out.println("ISBN : " + this.getIsbn());
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////
class Disc extends Product {
	String albumTitle, singer;

	void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	String getAlbumTitle() {
		return albumTitle;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	String getSinger() {
		return singer;
	}
	public void show() {
		super.show();
		System.out.println("앨범제목 : " + this.getAlbumTitle());
		System.out.println("가수 : " + this.getSinger());
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////
class Conversation extends Product {
	String language;

	void setLanguage(String language) {
		this.language = language;
	}
	String getLanguage() {
		return language;
	}

	public void show() {
		super.show();
		System.out.println("언어 : " + getLanguage());
	}
}

class Product_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);

		Product p[] = new Product[10];
		int i = 0;

		while(true) {
			System.out.print("상품추가( 1 )       상품조회( 2 )       종료( 3 )       : ");
			int n = sc.nextInt();

			switch(n) {
				case 1 :
					System.out.print("상품종류   :   책( 1 )       음악 CD( 2 )       회화책( 3 )       : ");
					int num = sc.nextInt();
					
					switch(num) {
						case 1 : 
							p[i] = new Book2();		break;
						case 2 : 
							p[i] = new Disc();		break;
						default :
							System.out.println("잘못 입력하셨습니다.");
							continue;
					}
					System.out.print("상품 ID : ");
					p[i].setId(sc.next());
					System.out.print("상품설명 : ");
					p[i].setInfo(sc.next());
					System.out.print("생산자 : ");
					p[i].setConsumer(sc.next());
					System.out.print("가격 : ");
					p[i].setPrice(sc.nextInt());

					switch(num) {
						case 1 : 
							System.out.print("책 제목 : ");
							p[i].setTitle(sc.next());
							System.out.print("저자 : ");
							p[i].setAuthor(sc.next());
							System.out.print("ISBN : ");
							p[i].setIsbn(sc.next());
							
							break;
						case 2 : 
							System.out.print("앨범 제목 : ");
							p[i].setAlbumTitle(sc.next());
							System.out.print("가수 : ");
							p[i].setSinger(sc.next());

							break;
						case 3 :
							System.out.print("언어 : ");
							p[i].setLanguage(sc.next());
					}
					i++;
					break;

				case 2 : 
					System.out.println("");
					for(int j = 0; j < i; j++) 
						System.out.println(j + 1 + ". " + p[j].getId());
					System.out.println("");
					System.out.print("몇 번을 조회하시겠습니까?(ID) : ");
					int choice = sc.nextInt();
					System.out.println("\n------------------------------");
					p[choice - 1].show();
					System.out.println("------------------------------\n");

					break;
				case 3 : 
					System.out.println("종료합니다.");
					System.exit(0);
				default :
					System.out.println("잘못 입력 하셨습니다.");
			}
		}
	}
}