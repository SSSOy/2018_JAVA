class Wine {
	private String manufacture, name, country, region, kind;
	private int year, grade;

	public Wine(String manufacture, String name, String country, String kind, int year, int grade){
		this.manufacture = manufacture;
		this.name = name;
		this.country = country;
		this.kind = kind;
		this.year = year;
		this.grade = grade;
	}
	public Wine(String manufacture, String name){
		this.manufacture = manufacture;
		this.name = name;
	}
}