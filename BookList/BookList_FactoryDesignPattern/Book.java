package Odevler.BookList_FactoryDesignPattern;

public class Book implements IBooks {
    private String bookName;
    private int pageNumber;
    private String authorName;
    private String releaseDate;

    private static Book book;

    public static Book getBookInstance(String bookName, int pageNumber, String authorName, String releaseDate){
        return new Book(bookName, pageNumber, authorName, releaseDate);
    }

    private Book(String bookName, int pageNumber, String authorName, String releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    @Override
    public String getBookName() {
        return this.bookName;
    }

    @Override
    public int getPageNumber() {
        return this.pageNumber;
    }

    @Override
    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pageNumber=" + pageNumber +
                ", authorName='" + authorName + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
