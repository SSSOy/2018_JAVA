abstract class Ship {
	abstract public int Passengers();
	abstract public int Luggage();
}
class Going_Merry {
	public int Passengers() {
		return 21;
	}
	public int Luggage() {
		return 56;
	}
}
class Ship_Test {
	public static void main(String ar[]) {
		Going_Merry m = new Going_Merry();
		
		System.out.println("최대 탑승 인원 : " + m.Passengers() + "명");
		System.out.println("최대 적재량 : " + m.Luggage() + "kg");
	}
}
