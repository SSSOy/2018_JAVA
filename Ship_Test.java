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
		
		System.out.println("�ִ� ž�� �ο� : " + m.Passengers() + "��");
		System.out.println("�ִ� ���緮 : " + m.Luggage() + "kg");
	}
}
