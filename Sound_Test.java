interface Sound {
	public void SoundUp();
	public void SoundDown();
}
class TV implements Sound {
	int SndLevel;
	public TV(int SndLevel) {
		this.SndLevel = SndLevel;
	}
	public void SoundUp() {
		this.SndLevel++;
	}
	public void SoundDown() {
		this.SndLevel--;
	}
	public int getSndLevel() {
		return SndLevel;
	}
}
class Sound_Test {
	public static void main(String ar[]) {
		TV tv = new TV(7);
		TV tv2 = new TV(3);
		tv.SoundUp();
		tv2.SoundDown();
		System.out.println("tv의 음량은  " + tv.getSndLevel() + "입니다.");
		System.out.println("tv2의 음량은  " + tv2.getSndLevel() + "입니다.");
	}
}