class  Sports {
	String name;
	int player;
	
	public Sports(String name, int player) {
		this.name = name;
		this.player = player;
	}

	public int getPlayer() {
		return player;
	}
	public String getName() {
		return name;
	}
	public void rule() { }
}
class BaseBall extends Sports {
	BaseBall(String name, int player) {
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
		System.out.println("�� : �Ŀ��� 4���� ����");
	}
}
class extends_Test1 {
		public static void main(String ar[]) {
				BaseBall b1 = new BaseBall("�߱�", 9);
				BasketBall b2 = new BasketBall("��", 5);

				System.out.println("������� : " + b1.getName());
				System.out.println("�����ο� : " + b1.getPlayer());
				b1.rule();

				System.out.println("������� : " + b2.getName());
				System.out.println("�����ο� : " + b2.getPlayer());
				b2.rule();
		}
}