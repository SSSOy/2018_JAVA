class Car {
	private String brand, owner, company;
	private int price;

	public Car(String brand, String owner, String company, int price) {
		this.brand = brand;
		this.owner = owner;
		this.company = company;
		this.price = price;
	}
	public Car( String owner, String company, int price) {
		this.owner = owner;
		this.company = company;
		this.price = price;
	}
	public Car(String company, int price) {
		this.company = company;
		this.price = price;
	}

	public String start() {
		return "초록불 입니다";
	}
	public String stop() {
		return "빨간불 입니다";
	}
	
	public static void main(String ar[]) {
		Car c1 = new Car("sonata", "Mike", "hyundai", 100);
		Car c2 = new Car("Alice", "kia", 200);
		Car c3 = new Car("Avante", 300);

		System.out.println("Brand : " + c2.brand);
		System.out.println("Owner : " + c2.owner);
		System.out.println("Company : " + c2.company);
		System.out.println("Price : " + c2.price);

		System.out.println(c3.start());
		System.out.println(c3.stop());
	}
}
		