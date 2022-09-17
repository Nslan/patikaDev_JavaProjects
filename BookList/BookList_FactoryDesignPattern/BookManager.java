package Odevler.BookList_FactoryDesignPattern;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookManager {

    private static List<IBooks> bookList;
    private static BookManager bookManagerObj;

    //singleton design pattern
    public static BookManager getBookManagerObj() {
        bookManagerObj  = new BookManager();
        return bookManagerObj;
    }

    public List<IBooks> addList(){

        bookList = List.of(
                BookFactory.getBookObj("mem ile zin" , 130 , "sadık yalsizucanlar" , "12/4/2018") ,
                BookFactory.getBookObj( "sah mat" , 450 , "mario marzanti" , "9/3/2015" ) ,
                BookFactory.getBookObj( "insan ne ile yasar" , 95 , "L. Nikoloyevic Tolstoy" , "15/6/1885") ,
                BookFactory.getBookObj( "Beyaz Gemi" , 168 , "mario marzanti" , "21/9/1970") ,
                BookFactory.getBookObj( "seker portakali" , 450 , "mario marzanti" , "27/10/201" ) ,
                BookFactory.getBookObj( "Cemile" , 70 , "mario marzanti" , "14/5/1958" ) ,
                BookFactory.getBookObj( "Olu Canlar" , 484 , "Vasilyevic Gogol" , "12/8/1842") ,
                BookFactory.getBookObj( "Aleksandr Puskin" , 138 , "Yuzbasinin Kizi" , "2/11/1836") ,
                BookFactory.getBookObj( "Karamazov Kardesler" , 840 , "Fyodor Dostoyevski" , "1/3/1880" ) ,
                BookFactory.getBookObj( "Haci Murat" , 160 , "mario marzanti" , "27/3/1912")
        ) ;


        return bookList;
    }

    public Map<String, String> mapList(){

        return addList().stream().collect(Collectors.toMap( key -> key.getBookName() , value -> value.getAuthorName() ) );

    }

    public List<IBooks> filterList(){

        return addList().stream().filter(bookObj -> bookObj.getPageNumber() > 100 ).collect(Collectors.toList());

    }



}
