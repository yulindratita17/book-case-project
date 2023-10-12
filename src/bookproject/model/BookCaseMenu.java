package bookproject.model;

import java.util.List;

import bookproject.abstracts.CommercialBook;
import bookproject.repositories.BookRepository;

public class BookCaseMenu {
    

    public static void runApp() {

        BookRepository bookRepo = new BookRepository();
        List<CommercialBook> listAllBook = bookRepo.getAllBook();

        String[] mainPublisher = { "Production Cost Termahal", "Production Cost Termurah", "Back To Main Menu" };
        mainMenu(listAllBook);

    }

    public static void mainMenu(List<CommercialBook> listAllBook) {
        String[] mainMenu = { "Book", "Author", "Publisher", "Exit" };
        int optionMainMenu;
        boolean isLooping = true;

        PrintData.printMenu("Main Menu", mainMenu);

        optionMainMenu = Integer
                .valueOf(Validation.validateNumberWithRange("Choose item: ", "Only number accepted",
                        Validation.regexNumber, 0, 3));

        do {
            switch (optionMainMenu) {
                case 1:
                    // panggil menu book
                    bookMenu(listAllBook);
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

    public static void bookMenu(List<CommercialBook> listAllBook) {
        String[] bookMenu = { "Find cheapest book", "Find most expensive book", "Find book by range price",
                "Find comic by mangaka rating", "Find book by publisher country", "Find book by author country",
                "Find most expensive comic", "Back to main menu" };
        int optionMenu;
        boolean isLooping = true;

        PrintData.printMenu("Book Menu Searching", bookMenu);
        optionMenu = Validation.validateNumberWithRange("Choose item: ", "Only number accepted",
                Validation.regexNumber, 0, 7);
        do {

            switch (optionMenu) {
                case 1:
                    PrintData.printDataBook("Cheapest Book", BookCaseAction.findBookByPrice("cheap", listAllBook));
                    isLooping = false;
                    break;
                case 2:
                    PrintData.printDataBook("Most Expensive Book",
                            BookCaseAction.findBookByPrice("expensive", listAllBook));
                    isLooping = false;
                    break;
                case 3:
                double price = Double.valueOf(Validation.validateInput("Enter price: ", "Only number accepted", Validation.regexNumber));
                PrintData.printDataBook("Book By Range Price " + price , BookCaseAction.findBookByRangePrice(price, listAllBook));
                isLooping = false;

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;

                case 0:
                
                    isLooping = false;
                    //mainMenu(listAllBook);
                    break;
            }
        } while (isLooping);

    }

}
