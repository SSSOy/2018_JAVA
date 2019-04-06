class Song {
	private String title, artist, album, composer[];
	private int year, track;

	public Song() { }
	public Song(String title, String artist, String album, String composer[], int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public void show() {
		System.out.println("���� : " + this.title);
		System.out.println("���� : " + this.artist);
		System.out.println("�ٹ� : " + this.album);
		for(int i = 0; i < composer.length; i++)
			System.out.println("�۰ : " + composer[i]);
		System.out.println("���� : " + this.year);
		System.out.println("Ʈ�� : " + this.track);
	}

	public static void main(String ar[]) {
		Song s = new Song("Dancing Queen", "ABBA", "Arrival", new String[]{"Benny Andersson", "Bjorn Ulvaeus", "Stig Anderson"}, 1976, 2);
		s.show();
	}
}