package Giris;

import  java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int value1,value2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number : ");
        value1 = input.nextInt();
        System.out.println("Enter First number : ");
        value2 = input.nextInt();

        System.out.println("Please choose ");
        System.out.println("1-Sum\n2-Subtraction\n3-Multiply\n4-Division");
        select = input.nextInt();

        switch ( select ){
            case 1 :
                System.out.println("Sum : " + value1 + value2 );
                break;
            case 2 :
                System.out.println("Subtraction :"+ (value1 - value2) );
                break;
            case 3 :
                System.out.println("Multiply :"+ value1 * value2 );
                break;
            case 4 :
                if ( value2 != 0 ){
                    System.out.println("Division :"+ value1 / value2);
                }else{
                    System.out.println("numbers cannot be divided by zero");
                }
        }




    }


}
