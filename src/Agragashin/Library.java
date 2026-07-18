package Agragashin;

// import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Library {
	String name;
	int yaer;
	Book[] books ; 
	
	Library(String name, int yaer, Book[] books) {
		this.name = name;
		this.yaer = yaer;
		this.books = books;
	}
	
	void displayInfo(){
		System.out.println("the " + this.yaer + " " + this.name);
		System.out.println("#### Book avalibul #####");
		for(Book book : books) {
			System.out.println(book.displayInfo());
		}
	}
}
