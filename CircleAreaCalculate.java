package Giris;

import java.util.Scanner;

public class CircleAreaCalculate {
    public static void main(String[] args) {


        double pi = 3.14 ,  radius , a  ;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius : ");
        radius = input.nextDouble();

        System.out.println("enter the angle : ");
        a = input.nextDouble();

        System.out.println("perimeter of the Circle : " + 2 * pi * radius );

        System.out.println("area of the Circle : " +  ( pi *  radius * radius * a ) / 360 );


    }
}
