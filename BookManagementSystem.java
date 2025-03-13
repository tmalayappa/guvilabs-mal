package Task4;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Library library = new Library(10); // Library can hold 10 books

		//implement menu driven user interface to interact with library system
		while (true) {  		
			//Allow user to Add, Remove, Replace, Search and Display books
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Replace Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Book ID: ");
				int bookID = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author: ");
				String author = scanner.nextLine();
				library.addBook(new Books(bookID, title, author));
				break;
			case 2:
				System.out.print("Enter Book ID to remove: ");
				int removeID = scanner.nextInt();
				library.removeBook(removeID);
				break;
            case 3:
                System.out.print("Enter Book ID to replace: ");
                int replaceID = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter New Title: ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter New Author: ");
                String newAuthor = scanner.nextLine();
                library.replaceBook(replaceID, new Books(replaceID, newTitle, newAuthor));
                break;
			case 4:
				System.out.print("Enter Book ID to search: ");
				int searchID = scanner.nextInt();
				Books foundBook = library.searchBook(searchID);
				if (foundBook != null) {
					System.out.println("Book found: " + foundBook);
				} else {
					System.out.println("Book not found.");
				}
				break;
			case 5:
				library.displayBooks();
				break;
            case 6:
                System.out.println("Exiting Library System.");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}