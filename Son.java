class GrandFather {
	GrandFather() {
		System.out.println("�Ҿƹ���");
	}
}
class Father extends GrandFather {
	Father() {
		System.out.println("�ƹ���");
	}
}
class Son extends Father {
	Son() {
		System.out.println("�Ƶ�");
	}

	public static void main(String ar[]) {
		Son s = new Son();
	}
}

//16-17-12-7-2-3-8-13