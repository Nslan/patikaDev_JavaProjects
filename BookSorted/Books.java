package Collections.Book.Odev;

public class Books implements Comparable<Books>{

    private String bookName;
    private int pageSize;
    private String authorName;
    private int date;

    public Books(String bookName, int pageSize, String authorName, int date) {
        this.bookName = bookName;
        this.pageSize = pageSize;
        this.authorName = authorName;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    @Override
    public int compareTo(Books o) {
        return this.getBookName().compareTo(o.getBookName());
    }
}
