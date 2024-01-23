package resources;

public class Journal extends Resources {

	private boolean jStor;

	public Journal() {

	}

	public Journal(int id, String title, String genre, String edition, int year, boolean jStor) {
		super(id, title, genre, edition, year);
		this.setjStor(jStor);
	}

	public boolean isjStor() {
		return jStor;
	}

	public void setjStor(boolean jStor) {
		this.jStor = jStor;
	};
//@Override
//	public void print() {
//		System.out.println("Available on JSTOR: " + this.jStor);
//	}
//
//	@Override
//	public String toString() {
//		return "Journal [jStor=" + jStor + "]";
//	
//	};


}
