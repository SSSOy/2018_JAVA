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
		return price;
	}
	public void show() {
		System.out.println("�� : " + model);
		System.out.println("ȸ�� : " + maker);
		System.out.println("���� : " + price);
	}
}

class Television_Test {
	public static void main(String ar[]) {
		Television t = new Television("KV-102", "LG", 300);

		t.show();
	}
}