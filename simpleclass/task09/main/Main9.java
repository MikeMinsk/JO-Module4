package by.mikem.jonline.module4.simpleclass.task09.main;

import java.util.List;

import by.mikem.jonline.module4.simpleclass.task09.entity.Book;
import by.mikem.jonline.module4.simpleclass.task09.entity.Library;
import by.mikem.jonline.module4.simpleclass.task09.logic.LibraryLogic;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и 
методами. Задать критерии выбора данных и вывести эти данные на консоль. 
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
Найти и вывести: 
a) список книг заданного автора; 
b) список книг, выпущенных заданным издательством; 
c) список книг, выпущенных после заданного года.*/

public class Main9 {

	public static void main(String[] args) {
		Library library = new Library();
		LibraryLogic libraryLogic = new LibraryLogic();

		libraryLogic.addBook(library,
				new Book(1, "Улисс", "Джеймс Дж.", "АСТ", 1922, 1056, 125.10, "Твердый переплет"));
		libraryLogic.addBook(library,
				new Book(2, "Трилогия желания", "Драйзер Т.", "АСТ", 1947, 1152, 221.35, "Твердый переплет"));
		libraryLogic.addBook(library,
				new Book(3, "Война и мир", "Толстой Л.", "АСТ", 1869, 1056, 325.12, "Твердый переплет"));
		libraryLogic.addBook(library,
				new Book(4, "Архипелаг ГУЛАГ", "Солженицын А.", "Эксмо", 1973, 1424, 195.00, "Твердый переплет"));
		libraryLogic.addBook(library, new Book(5, "В поисках утраченного времени", "Пруст М.", "Эксмо", 1913, 3031,
				797.32, "Твердый переплет"));
		libraryLogic.addBook(library, new Book(6, "Мы", "Замятин Е.", "Эксмо", 1920, 256, 35.20, "Мягкий переплет"));
		libraryLogic.addBook(library,
				new Book(7, "Цветок-огонек", "Благинина Е.", "Стрекоза", 2022, 95, 75.25, "Мягкий переплет"));

		printLibrary(libraryLogic.getBooksByAuthor(library, "Толстой Л."));

		printLibrary(libraryLogic.getBooksByPublisher(library, "АСТ"));

		printLibrary(libraryLogic.getBooksSinceYear(library, 1920));
	}

	private static void printLibrary(Library library) {
		if (library == null || library.getBooks().size() == 0) {
			System.out.println("Nothing to print!");
		}

		List<Book> books = library.getBooks();

		for (Book book : books) {
			System.out.println(book.toString());
		}

		System.out.println("--------------------------");
	}
}
