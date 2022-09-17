package Odevler.BookList_BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("BookList : " );
        BookManager.getBookManagerObj().addList().forEach(obj -> System.out.println("" + obj));




        System.out.println("\nMapped BookList " );
        BookManager.getBookManagerObj().mapList().forEach( (key , value ) -> System.out.println("" + key + " : " + value) );



        System.out.println("\nFilter BookList ( pageNumber > 100 ) : ");
        BookManager.getBookManagerObj().filterList().forEach(obj-> System.out.println("" + obj));


    }


}
