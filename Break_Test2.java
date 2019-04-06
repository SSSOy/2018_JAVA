//1~10을 출력하는데 1, 2, 3, 4만 출력
class Break_Test2 {
	public static void main(String ar[]) {
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
			if(i == 4){
				break;
			}
		}
	}
}