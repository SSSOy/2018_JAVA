//100이하의 두개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력
class Param_Test3 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		int temp;

		if(n > m){
			temp = n;
			n = m;
			m = temp;
		}

		for(int i = n; i <= m; i++)
			System.out.println(i);
	}
}