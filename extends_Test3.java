class Sport2 {
	String name;
	public void rule() {
		System.out.println("��⿡ ���� �ٸ�");
	}
}

class VallyBall extends Sport2 {
	int player;

	public void rule() {
		System.out.println("3�� �ȿ� �ű��");
	}
}
class Swim extends Sport2 {
	public void rule() {
		System.out.println("1�оȿ� ������");
	}
}

class extends_Test3 {
	public static void main(String ar[]) {
		VallyBall v = new VallyBall();
		Swim s = new Swim();

		v.rule();
		s.rule();
	}
}