import java.util.*;

interface Meter {
	public void start();
	public int stop(int distance);
}
class Taxi implements Meter {
	public void start() {
		System.out.println("출발합니다.");
	}
	public int stop(int distance) {
		return (distance * 2);
	}
}
class Meter_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달린 거리 입력 : ");
		int distance = sc.nextInt();

		Taxi t = new Taxi();
		t.start();
		System.out.println("요금은 " + t.stop(distance) + "원 입니다.");
	}
}