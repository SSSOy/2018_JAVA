class Car4 {
	String name;
	int displacement;

	public void Klaxon() {
		System.out.println("�ٶ�~~~");
	}
}

class Truck2 extends Car4 {	
	int loadage;

	public void Klaxon() {
		System.out.println("����!");
	}
	public void carry (int n) {
		loadage += n;
		System.out.println("���� " + n + "�� �Ǿ����ϴ�.");
	}
}

class SportsCar extends Car4 {
	public void Klaxon() {
		System.out.println("�ѿ;Ӗؾ�!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}

class Car4_Test {
	public static void main(String ar[]) {
		Car4 c[] = new Car4[3];

		c[0] = new Car4();
		c[1] = new Truck2();
		c[2] = new SportsCar();

		for(int i = 0; i < c.length; i++) 
			c[i].Klaxon();
	}
}

