import java.util.*;

interface Meter {
	public void start();
	public int stop(int distance);
}
class Taxi implements Meter {
	public void start() {
		System.out.println("����մϴ�.");
	}
	public int stop(int distance) {
		return (distance * 2);
	}
}
class Meter_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޸� �Ÿ� �Է� : ");
		int distance = sc.nextInt();

		Taxi t = new Taxi();
		t.start();
		System.out.println("����� " + t.stop(distance) + "�� �Դϴ�.");
	}
}