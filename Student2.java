class Student2 {
	String name;
	int grade;
	String sub;
	public void run(){
		System.out.println("뛰다");
	}
	public void study(String sub, int time){
		System.out.println(sub+"를 " + time + "시간 공부하다");
	}
	public void play(String where, String who){
		System.out.println(where+"에서 "+who+"와 놀다");
	}
}