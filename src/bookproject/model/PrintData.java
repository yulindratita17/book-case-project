package bookproject.model;

import java.util.List;

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
			}else {
				System.out.printf(formatTabel, number, menu);
			}	
			number++;
		}
	}
}
