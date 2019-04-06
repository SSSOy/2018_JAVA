class Switch_Test7 {
	public static void main(String ar[]) {
		int a = 7;
		switch(a % 3) {
			case 1 : case 2 : System.out.println("3의 배수가 아닙니다.");
						break;
			case 0 : System.out.println("3의 배수 입니다.");
				break;
		}
	}
}