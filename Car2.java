class Car2 {
	String brand;
	int price;
	String owner;
	String color;

	public Car2(String brand, int price, String owner, String color) {
		this(brand, owner);
	}
	public Car2(String bran, String owne) {
		this(owne);
		this.brand = bran;
	}
	public Car2(String own) {
		this();
		this.owner = own;
	}
	public Car2() {
		this.price = 1000000000;
		this.color = "orange";
	}

	public static void main(String ar[]) {
		Car2 c = new Car2("Sonata", 100, "Mike","Red");
		System.out.println("Brand : " + c.brand);
		System.out.println("Price : " + c.price);
		System.out.println("Owner : " + c.owner);
		System.out.println("Color : " + c.color);
	}
}

//24-7-8-10-11-14-15-18-19-20-16-12-26-27-28