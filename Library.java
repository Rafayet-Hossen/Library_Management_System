public class Library {
    private String bookTitle;
    private String author;
    private String category;

    public Library(String bookTitle, String author, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.category = category;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    
    
}
