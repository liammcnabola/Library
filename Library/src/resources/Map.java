package resources;

public class Map extends Resources {

	private String country;

	public Map() {

	}

	public Map(int id, String title, String genre, String edition, int year, String country) {
		super(id, title, genre, edition, year);
		this.setCountry(country);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public void print() {
		super.print();
		this.getTitle();
		this.getGenre();
		this.getEdition();
		this.getYear();
		System.out.println("Title: " + this.getTitle());
	}

	@Override
	public String toString() {
		return "Map [country=" + country + "]";
	};


}
