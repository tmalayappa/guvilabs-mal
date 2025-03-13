package Task4;

public class Library {
    private Books[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Books[capacity];
        this.bookCount = 0;
    }

    //Method to add books to the library
    public void addBook(Books book) { 		
    	//Add the book to the books array
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    
    //Method to remove books to the library
    public void removeBook(int bookID) {	
    	//Remove the book from the books array
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null; // Clear the last element
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }
    
    //Method to replace books to the library   
    public void replaceBook(int bookID, Books newBook) {		
    	//replace the book name and author of a given bookID from the books
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = newBook;
                System.out.println("Book replaced successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }
    
    //Method to search books to the library
    public Books searchBook(int bookID) {		
    	//Search for book from the array
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null; // Book not found
    }
    
    //Method to display books to the library
    public void displayBooks() {	
    	//Displays all book in the array
        if (bookCount == 0) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Library Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}

