class free_Test11 {
	public static void main(String ar[]) {
		int i = 1;
		int sum = 0;
		while(true){
			if(i % 2 == 0)
				sum -= i;
			else
				sum += i;
			if(sum == 100){
				System.out.println("i = " + i);
				break;
			}
			i++;
		}
	}
}