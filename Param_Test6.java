//두 개의 정수를 입력받아 두 정수 사이의 3의 배수이거나 7의 배수인 수들의 합과 평균 구하기

class Param_Test6 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		int sum = 0, a = 0, temp;
		float avg;
		
		if(n > m) {
			temp = n; 
			n = m; 
			m = temp;
		}

		for(int i = n; i <= m; i++){
			if(i % 3 == 0 || i % 7 == 0){
				sum += i;
				a++;
			}
		}
		avg = sum / a;

		System.out.println("합 : " + sum + ", 평균 : " + avg);
	}
}