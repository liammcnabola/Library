package runner;

import person.Person;
import resources.Book;
import resources.Inventory;
import resources.Journal;
import resources.Map;

public class App {

	public static void main(String[] args) {

		Book b1 = (new Book(0, "On the Origin of Species", "Science", "First", 1859, true));
		System.out.println(b1);

		Journal j1 = (new Journal(0,
				"Dietary and Habitat Shift with Size of Red-Eared Turtles (Pseudemys scripta)",
				"Nature", "Herpetologica, Vol. 39, No. 3", 1983, true));
		System.out.println(j1);

		Inventory inventory = new Inventory();
		inventory.addBook(new Book(0, "The Hobbit", "Fantasy", "First", 1937, false));
		inventory.addBook(new Book(0, "The Fellowship of the Ring", "Fantasy", "First", 1954, false));
		inventory.addBook(new Book(0, "The Two Towers", "Fantasy", "First", 1954, false));

		System.out.println("Inventory: " + inventory);

		inventory.addBook(b1);
		System.out.println("Adding b1: " + inventory);
		inventory.removeBook(b1);
		System.out.println("Removed b1: " + inventory);

		inventory.addJournal(j1);
		System.out.println("Adding j1: " + inventory);
		
		inventory.addJournal(new Journal(0, "How to Java", "Tech", "First", 2012, false));
		System.out.println("Adding new journal: " + inventory);
		inventory.removeJournal(j1);
		System.out.println(inventory);

		Map m1 = (new Map(0, "Navigating nature trails in Northumberland", "Navigation", "NA", 2004, "United Kingdom"));
		System.out.println(m1);

		inventory.removeBookId(5);
		System.out.println("The Two Towers(5) Removed: " + inventory.books);

		Person Liam = (new Person(0, "Liam", 30, "SR6"));
		System.out.println(Liam);
		Person Robyn = (new Person(0, "Robyn", 31, "SR6"));
		System.out.println(Robyn);
		inventory.addPerson(Liam);
		inventory.addPerson(Robyn);
		System.out.println("Members added: " + inventory.people);
		inventory.removePerson(Liam);
		System.out.println("Liam removed: " + inventory.people);

	}

}
