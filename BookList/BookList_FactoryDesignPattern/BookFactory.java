package Odevler.BookList_FactoryDesignPattern;


public class BookFactory{

    public static IBooks getBookObj(String bookName , int pageNumber , String authorName , String releaseDate ){
        return Book.getBookInstance(bookName, pageNumber, authorName, releaseDate);
    }

}
