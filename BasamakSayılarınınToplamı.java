package Giris;

import java.util.Scanner;

public class BasamakSayılarınınToplamı {
    public static void main(String[] args) {

        /**
         *    // Basamak Sayısı Bulma İşlemi
         *         // 2451 / 10 = 245
         *         // 245 / 10 = 24
         *         // 24 / 10 = 2
         *         // 2 / 10 = 0
         *         // 0 / 10 = 0
         *
         *         while (sayi != 0) {
         *             sayi /= 10;
         *             Counter++;
         *         }
         *
         * **/

        int sayi , basamakSayisi=0 , count=0 , tempSayi , total=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi gir :");
        sayi=scanner.nextInt();

        tempSayi = sayi;
        while ( sayi!= 0){

            sayi/=10;
            count++;

        }

        System.out.println(tempSayi+" sayisi "+count+" basamaklidir.");

        for (int i=1;i<=count;i++){

            total += ( tempSayi % Math.pow(10,i) ) / Math.pow(10,i-1);

        }
        System.out.println(total);


    }
}
