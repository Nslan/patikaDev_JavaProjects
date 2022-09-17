package Odevler.BookList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookManager {

    private static Book books;
    private static List<Book> bookList;
    private static Map<String,String> mapBookList;

    private static BookManager bookManagerObj;

    //singleton design pattern
    public static BookManager getBookManagerObj() {
        bookManagerObj  = new BookManager();
        return bookManagerObj;
    }

    public List<Book> addList(){

        bookList = new ArrayList<>();

        bookList.add( new Book("mem ile zin" , 130 , "sadık yalsizucanlar" , new Date(12/4/2018) ) );
        bookList.add( new Book( "sah mat" , 450 , "mario marzanti" , new Date(9/3/2015) ) );
        bookList.add( new Book( "insan ne ile yasar" , 95 , "L. Nikoloyevic Tolstoy" , new Date(15/6/1885) ) );
        bookList.add( new Book( "Beyaz Gemi" , 168 , "mario marzanti" , new Date(21/9/1970) ) );
        bookList.add( new Book( "seker portakali" , 450 , "mario marzanti" , new Date(27/10/2015) ) );
        bookList.add( new Book( "Cemile" , 70 , "mario marzanti" , new Date(14/5/1958 ) ) );
        bookList.add( new Book( "Olu Canlar" , 484 , "Vasilyevic Gogol" , new Date(12/8/1842) ) );
        bookList.add( new Book( "Aleksandr Puskin" , 138 , "Yuzbasinin Kizi" , new Date(2/11/1836) ) );
        bookList.add( new Book( "Karamazov Kardesler" , 840 , "Fyodor Dostoyevski" , new Date(1/3/1880) ) );
        bookList.add( new Book( "Haci Murat" , 160 , "mario marzanti" , new Date(27/3/1912) ) );


        return bookList;
    }

    public Map<String,String> mapList(){

        mapBookList = addList().stream().collect(Collectors.toMap( key -> key.getBookName() , value -> value.getAuthorName() ) );

        return  mapBookList;
    }

    public List<Book> filterList(){

        List<Book> newBookList = addList().stream().filter( bookObj -> bookObj.getPageNumber() > 100 ).collect(Collectors.toList());

        return newBookList;

    }



}
