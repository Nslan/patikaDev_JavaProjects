package Giris;

import java.util.Scanner;

public class KdvCalculator {

    public static void main(String[] args) {

        double tutar , kdvOran ;

        Scanner input = new Scanner(System.in);

        System.out.println("Ucret giriniz:");
        tutar = input.nextDouble();

        boolean tmp =  (tutar > 1000) ;

        kdvOran = tmp ? 0.08 : 0.18 ;

        System.out.println("KDV siz fiat    :" + tutar);
        System.out.println("KDV li fiat     :" + ( tutar + tutar * kdvOran ) );
        System.out.println("KDV tutari     :" + ( tutar * kdvOran ) );


    }

}
