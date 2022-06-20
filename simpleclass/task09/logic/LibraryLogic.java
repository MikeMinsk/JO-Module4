package by.mikem.jonline.module4.simpleclass.task09.logic;

import java.util.ArrayList;
import java.util.List;

import by.mikem.jonline.module4.simpleclass.task09.entity.Book;
import by.mikem.jonline.module4.simpleclass.task09.entity.Library;

public class LibraryLogic {

	public void addBook(Library library, Book book) {
		library.getBooks().add(book);
	}

	public boolean removeBook(Library library, Book book) {
		return library.getBooks().remove(book);
	}

	public Library getBooksByAuthor(Library library, String author) {
		List<Book> books = library.getBooks();
		List<Book> chosenBooks = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				chosenBooks.add(book);
			}
		}

		return new Library(chosenBooks);
	}

	public Library getBooksByPublisher(Library library, String publisher) {
		List<Book> books = library.getBooks();
		List<Book> chosenBooks = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getPublisher().equals(publisher)) {
				chosenBooks.add(book);
			}
		}

		return new Library(chosenBooks);
	}

	public Library getBooksSinceYear(Library library, int startYear) {
		List<Book> books = library.getBooks();
		List<Book> chosenBooks = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getPublicationYear() >= startYear) {
				chosenBooks.add(book);
			}
		}

		return new Library(chosenBooks);
	}
}
