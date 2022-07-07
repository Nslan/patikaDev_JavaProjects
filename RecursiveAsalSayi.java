package Giris;

import java.util.Scanner;

public class RecursiveAsalSayi {

    static int isasal(int sayi, int m) {

        if ( m <= (sayi / 2) ){

            if (sayi % m == 0) {

                return 0;

            } else return isasal(sayi, m + 1);


        }else return 1 ;

    }

    public static void main(String[] args) {

        int sayi;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi girin : ");
        sayi = scanner.nextInt();

        if (sayi <= 1 ){
            System.out.println("Sayi Asal degil!");
        }
        else {

            int i = isasal(sayi, 2 );

            System.out.println(i == 1 ? "Sayi asal" : "Sayi asal degil");
        }

    }

    


}
