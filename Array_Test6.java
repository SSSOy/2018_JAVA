class Array_Test6 {
	public static void main(String ar[]) {
		char ch[ ];
		ch = new char[ 26 ];
		for(int i = 0; i < ch.length; i++){
			ch[ i ] = (char)(97 + i);
			System.out.println(ch[ i ]);
		}
	}
}