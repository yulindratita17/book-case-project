package bookproject.main;

import java.util.List;

import bookproject.abstracts.ComercialBook;
import bookproject.model.Author;
import bookproject.model.PrintData;
import bookproject.model.SearchData;
import bookproject.repositories.BookRepository;

public class MainApp {
	public static void main(String[] args) {
		
		BookRepository bookRepo = new BookRepository();
		//ambil semua data book dari repository
		List<ComercialBook> listAllBook = bookRepo.getAllBook();
		String[] mainMenu = {"Book", "Author", "Publisher", "Exit"};
		String[] mainPublisher = {"Production Cost Termahal", "Production Cost Termurah", "Back To Main Menu"};

		List<Author> listDataAuthor = SearchData.getAllAuthorByCountry(listAllBook, "Indonesia");
		
		//Main Menu
	
	}
	
}
