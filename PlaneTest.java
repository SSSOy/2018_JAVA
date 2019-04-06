class Plane {
	static int count = 0;
	private String producer, model;
	private int passenger;

	public Plane() {
		count++;
	}
	public Plane(String producer, String model, int passenger) {
		this.producer = producer;
		this.model = model;
		this.passenger = passenger;
		count++;
	}
	public void setProducer(String s) {
		this.producer = s;
	}
	public void setModel(String s) {
		this.model = s;
	}
	public void setPassenger(int i) {
		this.passenger = i;
	}
	public String getProducer() {
		return this.producer;
	}
	public String getModel() {
		return this.model;
	}
	public int getPassenger() {
		return this.passenger;
	}
}
class PlaneTest {
	public static void main(String ar[]) {
		Plane p1 = new Plane();
		Plane p2 = new Plane("에어버스", "A380", 500);

		p1.setProducer("대한항공"); 
		p1.setModel("A560");
		p1.setPassenger(300);

		System.out.println("p1.producer : " + p1.getProducer());
		System.out.println("p1.model : " + p1.getModel());
		System.out.println("p1.passenger : " + p1.getPassenger());

		System.out.println("p2.producer : " + p2.getProducer());
		System.out.println("p2.model : " + p2.getModel());
		System.out.println("p2.passenger : " + p2.getPassenger());

		System.out.println("생성된 객체 수 : " + Plane.count);
	}
}


