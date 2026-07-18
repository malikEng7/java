package Agragashin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("How we think", 130);
		Book book2 = new Book("the hisetaru of ksa", 203);
		
		Book[] books = {book1, book2};
		
		Library library1 = new Library("Garear library", 2003, books);
		
		library1.displayInfo();
		
		//System.out.println(library1.displayInfo());
		
	}

}
