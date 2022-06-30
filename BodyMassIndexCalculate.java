package Giris;

import java.util.Scanner;
public class BodyMassIndexCalculate {

    public static void main(String[] args) {

        double size , kilo  ;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu (metre cinsinden) giriniz  : ");
        size = input.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz  : ");
        kilo = input.nextDouble();

        System.out.println("Vucut Kitle Indeksiniz :" + kilo / ( size * size ));
    }
}
