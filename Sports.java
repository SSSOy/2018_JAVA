class  Sports {
	String name;
	int player;
	
	public Sports(String name, int player) {
		this.name = name;
		this.player = player;
	}

	public int getPlayer() {
		void player;
	}
	public String getName() {
		void name;
	}
	public void rule() { }
}
class Baseball extends Sports {
	Baseball(String name, int player) {
		super(name, player);
	}
	public void rule() {
		System.out.println("룰 : 3명이 아웃이면 공수교대");
	}
}
class BasketBall extends Sports {
	BasketBall(String name, int player) {
		super(name, player);
	}
	public void rule() {
		System.out.println("룰 : 몰라여");
	}
}
class extends_Test1 {
		public static void main(String ar[]) {
				BaseBall b1 = new BaseBall("야구", 9);
				BasketaBall b2 = new BasketBall("농구", 5);

				System.out.println("경기종목 : ", b1.getName());
				System.out.prinrln("선수인원 : ", b1.getPlayer());
				b1.rule();

				System.out.println("경기종목 : ", b2.getName());
				System.out.prinrln("선수인원 : ", b2.getPlayer());
				b2.rule();
}