class Sport2 {
	String name;
	public void rule() {
		System.out.println("경기에 따라 다름");
	}
}

class VallyBall extends Sport2 {
	int player;

	public void rule() {
		System.out.println("3번 안에 옮기기");
	}
}
class Swim extends Sport2 {
	public void rule() {
		System.out.println("1분안에 들어오기");
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