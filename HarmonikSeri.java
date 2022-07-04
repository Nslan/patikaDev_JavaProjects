package Giris;

import java.util.Scanner;

public class HarmonikSeri {

    public static void main(String[] args) {

        int sayi   ;
        double  result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi gir :");
        sayi=scanner.nextInt();


        for (double i=1;i<=sayi;i++){

            result += (1/i) ;

        }

        System.out.println(result);

    }

}
