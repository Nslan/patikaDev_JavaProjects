package Collections.Book.Odev;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Books> bookSet = new TreeSet<>();

        bookSet.add( new Books("Insan ne ile yasar?" , 101 , "Lev Nikolayevic Tolstoy" , 1885  ) );
        bookSet.add( new Books("Insan gelecegini nasil kurar?" , 288 , "Ilber Ortayli" , 2022  ) );
        bookSet.add( new Books("Sen yola cik yol sana gorunur" , 184 , "Hakan Menguc" , 2021  ) );
        bookSet.add( new Books("Pes etme mucizeler yolda" , 232 , "Kinsun" , 2020  ) );
        bookSet.add( new Books("Babil'in en zengin adamı" , 152 , "George Samuel Clason" , 2018  ) );

        for ( Books in : bookSet ) {
            System.out.println(in.getBookName() + "\t" + in.getPageSize() + "\t" + in.getAuthorName() + "\t" + in.getDate());
        }

        System.out.println("");

        TreeSet<Books> booksSet = new TreeSet<>(new Comparator<Books>() {
            @Override
            public int compare(Books o1, Books o2) {
                return o1.getPageSize() - o2.getPageSize();
            }
        });


        booksSet.add( new Books("Insan ne ile yasar?" , 101 , "Lev Nikolayevic Tolstoy" , 1885  ) );
        booksSet.add( new Books("Insan gelecegini nasil kurar?" , 288 , "Ilber Ortayli" , 2022  ) );
        booksSet.add( new Books("Sen yola cik yol sana gorunur" , 184 , "Hakan Menguc" , 2021  ) );
        booksSet.add( new Books("Pes etme mucizeler yolda" , 232 , "Kinsun" , 2020  ) );
        booksSet.add( new Books("Babil'in en zengin adamı" , 152 , "George Samuel Clason" , 2018  ) );


        for ( Books in : booksSet ) {
            System.out.println(in.getBookName() + "\t" + in.getPageSize() + "\t" + in.getAuthorName() + "\t" + in.getDate());
        }


    }
}
