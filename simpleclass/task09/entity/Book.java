package by.mikem.jonline.module4.simpleclass.task09.entity;

import java.util.Objects;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private int publicationYear;
	private int pageCount;
	private double price;
	private String bindingType;
	
	public Book() {		
	}

	public Book(int id, String title, String author, String publisher, int publicationYear, int pageCount, double price,
			String bindingType) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
		this.pageCount = pageCount;
		this.price = price;
		this.bindingType = bindingType;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bindingType, id, pageCount, price, publicationYear, publisher, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bindingType, other.bindingType) && id == other.id
				&& pageCount == other.pageCount
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& publicationYear == other.publicationYear && Objects.equals(publisher, other.publisher)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return String.format(
				"Book [id=%s, title=%s, author=%s, publisher=%s, publicationYear=%s, pageCount=%s, price=%s, bindingType=%s]",
				id, title, author, publisher, publicationYear, pageCount, price, bindingType);
	}	
}
