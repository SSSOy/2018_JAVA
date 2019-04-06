//1부터 100까지 더해가는데 합이 100이 넘는 순간의 숫자 구하기
class Break_Test {
	public static void main(String ar[]) {
		int i = 1; 
		int sum = 0;
		while(true) {
			sum += i;
			if(sum >= 100){
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}