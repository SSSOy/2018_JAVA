//3. 알파벳 대문자를 소문자로 바꾸기
class While_Test5 {
	public static void main(String ar[]) {
		char i = 65;
		char j;
		while(i <= 90){
			j =(char)((int) i + 32);
			System.out.println(i + "  ->  " + j);
			i++;
		}
	}
}