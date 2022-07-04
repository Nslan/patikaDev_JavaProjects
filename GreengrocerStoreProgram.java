package Giris;


import java.util.Scanner;
public class GreengrocerStoreProgram {
    public static void main(String[] args) {

        double kilo , kilo1, kilo2 , kilo3 ,kilo4 , amount , pear = 2.14 , apple = 3.67 , tomatoes = 1.11 , banana = 0.95, eggplant = 5.00 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kac kilo : ");
        kilo = input.nextDouble();

        System.out.println("Elma Kac kilo : ");
        kilo1 = input.nextDouble();

        System.out.println("Domates Kac kilo : ");
        kilo2 = input.nextDouble();

        System.out.println("Muz Kac kilo : ");
        kilo3 = input.nextDouble();

        System.out.println("Patlican Kac kilo : ");
        kilo4 = input.nextDouble();

        amount = kilo * pear  + kilo1 * apple + kilo2 * tomatoes  + kilo3 * banana + kilo4 * eggplant ;

        System.out.println("toplam : " + amount );


    }

}
