package bookproject.abstracts;

import bookproject.interfaces.ICommercialBook;
import bookproject.model.Author;
import bookproject.model.Publisher;

public abstract class ComercialBook extends Book implements ICommercialBook {
	private double price;
	
	public ComercialBook() {
		// TODO Auto-generated constructor stub
	}

	public ComercialBook(String bookCode, String tilte, Author author, Publisher publisher, double price) {
		super(bookCode, tilte, author, publisher);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ComercialBook [price=" + price + ", getPrice()=" + getPrice() + ", getBookCode()=" + getBookCode()
				+ ", getTilte()=" + getTilte() + ", getAuthor()=" + getAuthor() + ", getPublisher()=" + getPublisher()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
