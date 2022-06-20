package by.mikem.jonline.module4.simpleclass.task09.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
	List<Book> books;

	public Library() {
		this.books = new ArrayList<Book>();
	}

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(books, other.books);
	}

	@Override
	public String toString() {
		return String.format("Library [library=%s]", books);
	}	
}
