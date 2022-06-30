package Giris;
import java.util.Scanner;

public class taximeter {

    public static void main(String[] args) {

        double total , km ;
        Scanner input = new Scanner(System.in);

        System.out.println("lutfen km yi giriniz : ");

        km = input.nextDouble();

        total = 10 + ( km * 2.20 ) ;

        boolean temp = ( total < 20 ) ;

        total = temp ? (20) : ( total ) ;

        System.out.println(" cost : " + total );

    }

}
