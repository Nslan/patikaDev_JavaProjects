package Odevler.BookList;

import java.util.Date;

public class Book {

    private String bookName;
    private int pageNumber;
    private String authorName;
    private Date releaseDate;

    public Book(String bookName, int pageNumber, String authorName, Date releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
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
