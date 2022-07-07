package Giris;

import java.util.Scanner;

public class Palindrom {

    static Boolean isPalindrom(int number){

        int temp = number , lastNumber , reverseNumber = 0 ;

           while ( temp !=0 ) {

               lastNumber = temp % 10;

               reverseNumber = (reverseNumber * 10) + lastNumber;


               temp /= 10;
           }
        return true;
    }

    public static void main(String[] args) {

        int sayi ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi gir :");

        sayi = scanner.nextInt();

        System.out.print(  isPalindrom(sayi) ? sayi + " Sayisi Palindrom" : sayi + " Sayisi Palindrom degil!"  ) ;



    }


}
