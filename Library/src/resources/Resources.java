package resources;

public abstract class Resources {

	private static int count = 1;
	private int id;
	private String title;
	private String genre;
	private String edition;
	private int year;

	public Resources() {
		super();
		count++;
	}

	public Resources(int id, String title, String genre, String edition, int year) {
		super();
		this.id = count++;
		this.title = title;
		this.genre = genre;
		this.edition = edition;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void print() {
		System.out.println("ID: " + this.id );
		System.out.println("Title: " + this.title);
		System.out.println("Genre: " + this.genre);
		System.out.println("Edition: " +this.edition );
		System.out.println("Year Published: " +this.year );
		
	}

	@Override
	public String toString() {
		return " id=" + id + ", title=" + title + ", genre=" + genre + ", edition=" + edition + ", year="
				+ year + "]";
	}

}
