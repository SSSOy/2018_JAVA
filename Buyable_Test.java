interface Buyable {
	public int getPrice();
}
class Television implements Buyable {
	String model, maker;
	int price;
	public Television(String model, String maker, int price) {
		this.model = model;
		this.maker = maker;
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}
class Buyable_Test {
	public static void main(String ar[]) {
		Television t = new Television("abc123", "SAMSUNG", 10000000);
		System.out.println("��ǰ �� : " + t.model);
		System.out.println("ȸ�� : " + t.maker);
		System.out.println("���� : " + t.getPrice());
	}
}