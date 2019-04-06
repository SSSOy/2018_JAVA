abstract class Ship2 {

	abstract public int maxspeed();	//최대속도
	abstract public int passenger();	//탑승 인원
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

		System.out.println("보트의 최대속도 : " + b.maxspeed());
		System.out.println("보트의 탑승인원 : " + b.passenger());

		System.out.println("요트의 최대속도 : " + y.maxspeed());
		System.out.println("요트의 탑승인원 : " + y.passenger());
	}
}