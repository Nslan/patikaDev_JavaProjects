package Giris;

import java.util.Scanner;

public class WhatIsYourHoroscope {

    public static void main(String[] args) {

        int day , month;
        Scanner input = new Scanner(System.in);

        System.out.println("Dogdugunuz ay : ");
        month = input.nextInt() ;

        System.out.println("Dogdugunuz gun : ");
         day = input.nextInt() ;

        if( month == 1 ){
            System.out.println( (day>21) ? "Kova" : "Oglak" );
        } else if ( month == 2 ) {
            System.out.println( (day>19) ? "Balık" : "Kova" );
        } else if ( month == 3 ) {
            System.out.println( (day>20) ? "Koc" : "Balık" );
        } else if ( month == 4 ) {
            System.out.println( (day>20) ? "Boga" : "Koc" );
        } else if ( month == 5 ) {
            System.out.println( (day>21) ? "Ikizler" : "Boga" );
        } else if ( month == 6 ) {
            System.out.println( (day>22) ? "Yengec" : "Ikizler" );
        } else if ( month == 7 ) {
            System.out.println( (day>22) ? "Aslan" : "Yengec" );
        } else if ( month == 8 ) {
            System.out.println( (day>22) ? "Basak" : "Aslan" );
        } else if ( month == 9 ) {
            System.out.println( (day>22) ? "Terazi" : "Basak" );
        } else if ( month == 10 ) {
            System.out.println( (day>22) ? "Akrep" : "Terazi" );
        } else if ( month == 11 ) {
            System.out.println( (day>21) ? "Yay" : "Akrep" );
        } else if ( month == 12 ) {
            System.out.println( (day>22) ? "Oglak" : "Yay" );
        }

    }

}