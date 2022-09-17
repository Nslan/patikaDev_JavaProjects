package Odevler.BookList_BuilderDesignPattern;

public class BookBuilder {
    private String bookName;
    private int pageNumber;
    private String authorName;
    private String releaseDate;

    public static BookBuilder startBuild(){
        return new BookBuilder();
    }

    public Book build(){ //builder design pattern

        Book book = Book.getBookInstance();

        book.setBookName( bookName );
        book.setAuthorName( authorName );
        book.setPageNumber( pageNumber );
        book.setReleaseDate( releaseDate );

        return book;
    }

    public BookBuilder setBookName( String  bookName ){
        this.bookName = bookName ;
        return this;
    }


    public BookBuilder setAuthorName( String  authorName ){
        this.authorName = authorName ;
        return this;
    }


    public BookBuilder setPageNumber( int  pageNumber ){
        this.pageNumber = pageNumber ;
        return this;
    }


    public BookBuilder setReleaseDate(String releaseDate ){
        this.releaseDate = releaseDate ;
        return this;
    }


}
