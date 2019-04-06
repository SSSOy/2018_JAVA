//10개의 정수를 입력받아 짝수의 개수와 홀수의 개수 구하기

class Param_Test5 {
	public static void main(String ar[]){
		int n[] = new int[10];
		int a = 0, b = 0;

		for(int i = 0; i < n.length; i++){
			n[i] = Integer.parseInt(ar[i]);
			if(n[i] % 2 == 0)
				a++;
			else
				b++;
		}
		System.out.println("짝수의 개수 : " + a);
		System.out.println("홀수의 개수 : " + b);
	}
}