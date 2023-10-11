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

    public static void mainMenu() {
        String[] mainMenu = { "Book", "Author", "Publisher", "Exit" };
        int optionMainMenu;
        boolean isLooping = true;

        PrintData.printMenu("Main Menu", mainMenu);

        optionMainMenu = Integer
                .valueOf(Validation.validateNumberWithRange("Choose item: ", "Only number accepted", Validation.regexNumber, 0, 3));

        do {
            switch (optionMainMenu) {
                case 1:
                    // panggil menu book
                    break;
                case 2:
                    // panggil menu author
                    break;
                case 3:
                    // panggil menu publisher
                    break;
                case 0:
                    // menu exit
                    isLooping = false;

                    break;

            }
        } while (isLooping);

    }

}
