package Giris;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayisini gir :");
        sayi = scan.nextInt();

        System.out.print(0+" "+1+" ");

        int a=0 , b = 1 , c =0;
        for ( int i=2; i<=sayi; i++){

            c = a + b ;
            a = b ;
            b = c ;
            System.out.print(c+" ");

        }

    }

}
