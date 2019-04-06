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
		System.out.println("제목 : " + this.title);
		System.out.println("가수 : " + this.artist);
		System.out.println("앨범 : " + this.album);
		for(int i = 0; i < composer.length; i++)
			System.out.println("작곡가 : " + composer[i]);
		System.out.println("연도 : " + this.year);
		System.out.println("트랙 : " + this.track);
	}

	public static void main(String ar[]) {
		Song s = new Song("Dancing Queen", "ABBA", "Arrival", new String[]{"Benny Andersson", "Bjorn Ulvaeus", "Stig Anderson"}, 1976, 2);
		s.show();
	}
}