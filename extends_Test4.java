class Car3 {
	
	String carname, color;
	int velocity; 

	Car3(String name, String color, int velocity) {
		this.carname = name;
		this.color = color;
		this.velocity = velocity;
	}
	public void speedUp() { //5�� ����
		velocity += 5;
	}
	public void speeddown() { //5�� ����
		velocity -= 5;
	}
}
class Truck extends Car3 {
	int weight;
	Truck(String name, String color, int velocity, int weight) {
		super(name, color, velocity);
		this.weight = weight;
	}
}

class extends_Test4 {
	public static void main(String ar[]) {
		Truck t = new Truck("����Ƽ��", "������", 80, 3);

		System.out.println("���� Ʈ���� " + t.color +"�̴�.");
		System.out.println(t.carname + "�� " + t.weight + "�� ���� �� �ִ�.");
	}
}

//��°��: ���� Ʈ���� �������̴�
//����Ƽ��� 3���� ���� �� �ִ�.