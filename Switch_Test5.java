class Switch_Test5 {
	public static void main(String ar[]) {
		int month = 4;
		if (month - 8 < 0) {
			switch (month % 2) {
			case 0 : System.out.println("30��");
			break;
			case 1 : System.out.println("31��");
			break;
			}
		}
		else if (month - 8 > 0) {
			switch(month % 2){
			case 0 : System.out.println("31��");
			break;
			case 1 : System.out.println("30��");
			break;
			}
		}
		else {
			System.out.println("�߸��Է�");
		}
	}
}