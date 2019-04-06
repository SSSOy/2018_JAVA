class GrandFather {
	GrandFather() {
		System.out.println("할아버지");
	}
}
class Father extends GrandFather {
	Father() {
		System.out.println("아버지");
	}
}
class Son extends Father {
	Son() {
		System.out.println("아들");
	}

	public static void main(String ar[]) {
		Son s = new Son();
	}
}

//16-17-12-7-2-3-8-13