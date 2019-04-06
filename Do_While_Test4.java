//4 . char c = 'a'일 때 a ~ z까지 출력

class Do_While_Test4 {
	public static void main(String ar[]) {
		char c = 'a';

		do {
			System.out.println( c );
			c++;
		} while( c <= 'z');
	}
}