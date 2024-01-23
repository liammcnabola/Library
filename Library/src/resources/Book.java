package resources;

public class Book extends Resources {

	private boolean nonFiction;

	public Book() {
	};

	public Book(int id, String title, String genre, String edition, int year, boolean nonFiction) {

		super(id, title, genre, edition, year);
		this.setNonFiction(nonFiction);
	}

	public boolean getNonFiction() {
		return nonFiction;
	}

	public void setNonFiction(boolean nonFiction) {
		this.nonFiction = nonFiction;

	}

	@Override
	public void print() {
		super.print();
		this.getTitle();
		this.getGenre();
		this.getEdition();
		this.getYear();
		System.out.println("Non Fiction: " + this.nonFiction);
	};

//	@Override
//	public String toString() {
//
//		return "Book [nonFiction=" + nonFiction + "]";
//	}
//


}
