package Odevler.BookList_FactoryDesignPattern;

public class Main {

    public static void main(String[] args) {

        BookManager.getBookManagerObj().addList().forEach(obj -> System.out.println("" + obj));

        System.out.println();

        BookManager.getBookManagerObj().filterList().forEach(obj-> System.out.println("" + obj));

        System.out.println();

        BookManager.getBookManagerObj().mapList().forEach( (key , value ) -> System.out.println("" + key + " : " + value) );

    }


}
