package Giris;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int value , temp = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi gir :");
        value = input.nextInt();

        for (int i=1; i<value; i++){

            if ( value % i == 0 ){

                temp += i ;

            }

        }

        System.out.print( (temp == value ) ? value + " Mukemmel sayi" :  value + " Mukemmel sayi degildir." );


    }
}
