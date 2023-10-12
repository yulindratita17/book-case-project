package bookproject.model;

import java.util.List;

import bookproject.abstracts.CommercialBook;

public class PrintData {
	public static void printDataAuthor(List<Author> listData) {
		for (Author data : listData) {
			System.out.println(data);
			System.out.println("==============");
		}
	}

	public static void printMenu(String title, String[] listMenu) {
		int number = 1;
		String formatTabel = "| %-4s | %-30s |%n";
		System.out.println("=========" + title + "=========");

		for (String menu : listMenu) {
			if (number == listMenu.length) {
				System.out.printf(formatTabel, 0, menu);
			} else {
				System.out.printf(formatTabel, number, menu);
			}
			number++;
		}
	}

	public static void printDataBook(String tittle, List<CommercialBook> listData) {
		int num = 1;
		String formatTabel = "| %-4s | %-12s | %-55s | %-25s | %-22s | %-5s | %n";
		System.out.println("\n==============================================================================================================================================");
		System.out.printf("| %-138s |%n", tittle);
		System.out.println("==============================================================================================================================================");
		System.out.printf(formatTabel, "No", "Book Code", "Tittle", "Author", "Publisher", "Price");
		System.out.println("==============================================================================================================================================");

		for (CommercialBook data : listData) {
			System.out.printf(formatTabel, num, data.getBookCode(), data.getTittle(), data.getAuthor().getFullName(),
					data.getPublisher().getPublisherName(), String.format("%.2f",data.getPrice()));
			num++;
		}
		System.out.println("==============================================================================================================================================\n");
	}
}
