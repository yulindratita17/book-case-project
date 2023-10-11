package bookproject.abstracts;

import bookproject.model.Author;
import bookproject.model.Publisher;

public abstract class Book {
	private String bookCode;
	private String tilte;
	private Author author;
	private Publisher publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookCode, String tilte, Author author, Publisher publisher) {
		super();
		this.bookCode = bookCode;
		this.tilte = tilte;
		this.author = author;
		this.publisher = publisher;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	
	
}
