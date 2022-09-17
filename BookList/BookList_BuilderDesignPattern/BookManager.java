package Odevler.BookList_BuilderDesignPattern;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookManager {

    private static List<Book> bookList;
    private static BookManager bookManagerObj;

    public static BookManager getBookManagerObj() {//singleton design pattern
        bookManagerObj  = new BookManager();
        return bookManagerObj;
    }

    public List<Book> addList(){

        bookList = List.of(
            BookBuilder.startBuild().setBookName("mem ile zin").setPageNumber(130).setAuthorName("sadik yalsizucanlar").setReleaseDate( "2018" ).build()  ,
            BookBuilder.startBuild().setBookName("sah mat" ).setPageNumber( 450).setAuthorName( "mario marzanti").setReleaseDate( "2014" ).build()  ,
            BookBuilder.startBuild().setBookName("insan ne ile yasar" ).setPageNumber( 95 ).setAuthorName("L. Nikoloyevic Tolstoy").setReleaseDate( "1885" ).build()  ,
            BookBuilder.startBuild().setBookName("Beyaz Gemi" ).setPageNumber( 168).setAuthorName( "mario marzanti").setReleaseDate( "1970" ).build()  ,
            BookBuilder.startBuild().setBookName("seker portakali" ).setPageNumber( 450).setAuthorName( "mario marzanti").setReleaseDate( "2015" ).build()  ,
            BookBuilder.startBuild().setBookName("Cemile" ).setPageNumber( 70 ).setAuthorName("mario marzanti").setReleaseDate( "1958 " ).build()  ,
            BookBuilder.startBuild().setBookName("Olu Canlar" ).setPageNumber( 484).setAuthorName( "Vasilyevic Gogol").setReleaseDate( "1842" ).build() ,
            BookBuilder.startBuild().setBookName("Aleksandr Puskin" ).setPageNumber( 138).setAuthorName( "Yuzbasinin Kizi").setReleaseDate( "1836" ).build() ,
            BookBuilder.startBuild().setBookName("Karamazov Kardesler" ).setPageNumber( 840).setAuthorName( "Fyodor Dostoyevski").setReleaseDate( "1880" ).build() ,
            BookBuilder.startBuild().setBookName("Haci Murat" ).setPageNumber( 160).setAuthorName( "mario marzanti").setReleaseDate( "1912" ).build()
        );

        return bookList;
    }

    public Map<String,String> mapList(){

        return addList().stream().collect(Collectors.toMap( key -> key.getBookName() , value -> value.getAuthorName() ) );

    }

    public List<Book> filterList(){

        return  addList().stream().filter(bookObj -> bookObj.getPageNumber() > 100 ).collect(Collectors.toList());

    }



}
