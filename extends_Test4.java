class Car3 {
	
	String carname, color;
	int velocity; 

	Car3(String name, String color, int velocity) {
		this.carname = name;
		this.color = color;
		this.velocity = velocity;
	}
	public void speedUp() { //5씩 증가
		velocity += 5;
	}
	public void speeddown() { //5씩 감소
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
		Truck t = new Truck("프론티어", "검정색", 80, 3);

		System.out.println("나의 트럭은 " + t.color +"이다.");
		System.out.println(t.carname + "은 " + t.weight + "톤 실을 수 있다.");
	}
}

//출력결과: 나의 트럭은 검정색이다
//프론티어는 3톤을 실을 수 있다.