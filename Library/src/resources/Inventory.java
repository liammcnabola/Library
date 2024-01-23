package resources;

import java.util.ArrayList;
import java.util.List;

import person.Person;

public class Inventory {

	// Books:
	public ArrayList<Book> books = new ArrayList<>();

	public void addBook(Book b) {
		books.add(b);
	}

	public void removeBook(Book b) {
		books.remove(b);
	}

	public boolean removeBookId(int id) {
		List<Book> toRemove = new ArrayList<Book>();
		for (Book book : this.books) {
			if (book.getId() == id) {
				toRemove.add(book);
			}
		}
		return this.books.removeAll(toRemove);
	}

	public boolean addBookId(int id) {
		List<Book> toAdd = new ArrayList<Book>();
		for (Book book : this.books) {
			if (book.getId() == id) {
				toAdd.add(book);
			}
		}
		return this.books.addAll(toAdd);

	}

	// Maps:
	private ArrayList<Map> maps = new ArrayList<>();

	public void addMap(Map m) {
		maps.add(m);
	}

	public void removeMap(Map m) {
		journals.remove(m);
	}

	public boolean removeMapId(int id) {
		List<Map> toRemove = new ArrayList<Map>();
		for (Map map : this.maps) {
			if (map.getId() == id) {
				toRemove.add(map);
			}
		}
		return this.maps.removeAll(toRemove);
	}

//Journals:
	private ArrayList<Journal> journals = new ArrayList<>();

	public void addJournal(Journal j) {
		journals.add(j);
	}

	public void removeJournal(Journal j) {
		journals.remove(j);
	}

	public boolean removeJournalId(int id) {
		List<Journal> toRemove = new ArrayList<Journal>();
		for (Journal journal : this.journals) {
			if (journal.getId() == id) {
				toRemove.add(journal);
			}
		}
		return this.journals.removeAll(toRemove);
	}

//People:
	public ArrayList<Person> people = new ArrayList<>();

	public void addPerson(Person person) {
		people.add(person);
	}

	public void removePerson(Person person) {
		people.remove(person);
	}

	@Override
	public String toString() {
		return "Inventory [books=" + books + ", maps=" + maps + ", journals=" + journals + "]";
	}


	}


