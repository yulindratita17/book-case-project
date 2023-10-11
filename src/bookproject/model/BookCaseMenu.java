package bookproject.model;

import java.util.List;

import bookproject.abstracts.ComercialBook;
import bookproject.repositories.BookRepository;

public class BookCaseMenu {

    public static void runApp() {
        BookRepository bookRepo = new BookRepository();
        // ambil semua data book dari repository
        List<ComercialBook> listAllBook = bookRepo.getAllBook();
        
        String[] mainPublisher = { "Production Cost Termahal", "Production Cost Termurah", "Back To Main Menu" };
        mainMenu();

    }

    public static void mainMenu(){
        String[] mainMenu = { "Book", "Author", "Publisher", "Exit" };
        PrintData.printMenu("Main Menu", mainMenu);
    }

}
