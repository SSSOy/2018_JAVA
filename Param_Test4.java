//정수를 입력받아 입력받은 정수까지 4의배수 출력
class Param_Test4 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		
		for(int i = 4; i < n; i += 4)
			System.out.println(i);
	}
}
