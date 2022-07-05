package Giris;

import java.util.Scanner;

public class AsalSayıBul {
    public static void main(String[] args) {

        System.out.println("Girilen iki sayı arasındaki asal sayıları ekrana yazdırma :");

        int a , b , max , min ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayiyi gir :");
        a = scanner.nextInt();

        System.out.print("1. sayiyi gir :");
        b = scanner.nextInt();


        max = ( a > b ) ? a  : b ; // max hangisi
        min = ( a < b ) ? a  : b ; // max hangisi

        for ( int  i = min ; i < max ; i++ ){

            boolean key = false;

            for ( int j = 2; j < i ; j++ ){

                if ( i % j == 0 ){// en azz 1 kez bile volune biliyorsa true yap donguden cık
                     key = true;
                     break;
                }

            }
            if (key == false){
                System.out.print(i+" ");

            }

        }

    }
}
