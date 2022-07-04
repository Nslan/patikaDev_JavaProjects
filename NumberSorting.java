package Giris;

import java.util.Scanner;

public class NumberSorting {

    public static void main(String[] args) {

        int value1 , value2 , value3 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value:");
        value1 = input.nextInt();
        System.out.print("Enter second value:");
        value2 = input.nextInt();
        System.out.print("Enter third value:");
        value3 = input.nextInt();

        if ( ( value1 > value2 ) && (value1 > value3 ) ){

            if ( value2 > value3 ){
                System.out.println("value3 < value2 < value1 ");
            }else{
                System.out.println("value2 < value3 < value1 ");
            }

        }else if( ( value2 > value1 ) && ( value2 > value3 ) ){

            if ( value1 > value3 ){
                System.out.println("value3 < value1 < value2 ");
            }else {
                System.out.println("value1 < value3 < value2 ");
            }

        } else if ( (value3 > value1 ) && (value3 > value2) ) {
            if ( value2 > value1 ){
                System.out.println("value1 < value2 < value3 ");
            }else {
                System.out.println("value2 < value1 < value3 ");
            }

        }


    }

}
