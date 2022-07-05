package Giris;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {

        int value , sayi , min = 0 , max = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kac sayi gireceksin :");
        sayi = input.nextInt();

        for (int i=1;i<=sayi;i++){

            System.out.print(i+". Sayiyi girin :" );
            value = input.nextInt();

            if ( value <= min ){
                min = value ;
            } else if ( value >= max ) {
                max = value ;
            }

        }

        System.out.println("En buyuk sayi :"+max);
        System.out.println("En kucuk sayi :"+min);

    }
}
