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
		System.out.println("�� : 3���� �ƿ��̸� ��������");
	}
}
class BasketBall extends Sports {
	BasketBall(String name, int player) {
		super(name, player);
	}
	public void rule() {
		System.out.println("�� : ����");
	}
}
class extends_Test1 {
		public static void main(String ar[]) {
				BaseBall b1 = new BaseBall("�߱�", 9);
				BasketaBall b2 = new BasketBall("��", 5);

				System.out.println("������� : ", b1.getName());
				System.out.prinrln("�����ο� : ", b1.getPlayer());
				b1.rule();

				System.out.println("������� : ", b2.getName());
				System.out.prinrln("�����ο� : ", b2.getPlayer());
				b2.rule();
}