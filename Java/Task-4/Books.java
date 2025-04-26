package Task4;

public class Books {

	//attributes
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    //constructor to initialize book attributes
    public Books(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Initially available
    }

    //Getter and Setter methods for book attribute
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
    
	public void DisplayBooks () {
        System.out.println("Book ID : " + bookID);
        System.out.println("Boo's Title : " + title);
        System.out.println("Author's Name : " + author);
        System.out.println("Avaialability : " + isAvailable);
	}
}

