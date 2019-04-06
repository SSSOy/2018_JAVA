class Switch_Test5 {
	public static void main(String ar[]) {
		int month = 4;
		if (month - 8 < 0) {
			switch (month % 2) {
			case 0 : System.out.println("30老");
			break;
			case 1 : System.out.println("31老");
			break;
			}
		}
		else if (month - 8 > 0) {
			switch(month % 2){
			case 0 : System.out.println("31老");
			break;
			case 1 : System.out.println("30老");
			break;
			}
		}
		else {
			System.out.println("肋给涝仿");
		}
	}
}