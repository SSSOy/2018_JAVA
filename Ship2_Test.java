abstract class Ship2 {

	abstract public int maxspeed();	//�ִ�ӵ�
	abstract public int passenger();	//ž�� �ο�
}
class Boat extends Ship2 {
	public int maxspeed() {
		return 200;
	}
	public int passenger() {
		return 50;
	}
}
class Yacht extends Ship2 {
	public int maxspeed() {
		return 70;
	}
	public int passenger() {
		return 30;
	}
}
class Ship2_Test {
	public static void main(String ar[]) {
		Boat b = new Boat();
		Yacht y = new Yacht();

		System.out.println("��Ʈ�� �ִ�ӵ� : " + b.maxspeed());
		System.out.println("��Ʈ�� ž���ο� : " + b.passenger());

		System.out.println("��Ʈ�� �ִ�ӵ� : " + y.maxspeed());
		System.out.println("��Ʈ�� ž���ο� : " + y.passenger());
	}
}