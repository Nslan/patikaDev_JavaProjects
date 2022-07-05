package Giris;

import java.util.Scanner;

public class YıldılarlaTersUcgen {

    public static void main(String[] args) {

        int sayi;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Sayi gir :");
        sayi = scanner.nextInt();

        for (int i=sayi;i>=0;i--){

            for ( int j=0;j< sayi - i; j++){
                System.out.print(" ");
            }
            for ( int k=1; k<=2*i+1; k++ ){
                System.out.print("*");
            }

            System.out.println(" ");

        }




    }

}
