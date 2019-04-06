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
		System.out.println("모델 : " + model);
		System.out.println("회사 : " + maker);
		System.out.println("가격 : " + price);
	}
}

class Television_Test {
	public static void main(String ar[]) {
		Television t = new Television("KV-102", "LG", 300);

		t.show();
	}
}