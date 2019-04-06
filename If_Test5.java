class If_Test5 {
	public static void main(String ar[]) {
	int a = 10;
	int b = 20;
	char c = '*';
	if(c == '+'){
		System.out.println(a + b);
	}
	else if(c == '-'){
		System.out.println(a - b);
	}
	else if(c == '*'){
		System.out.println(a * b);
	}
	else if(c == '/'){
		System.out.println(a / b);
	}
	else{
		System.out.println("잘못입력");
	}
}
}