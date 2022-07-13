package Giris.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DizideGirilenSayıdanKucukEnYakınVeBuyukEnYakınSayı {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-128,2,0};
        int number , enYakinMin , enYakinMax;

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayi : ");
        number = input.nextInt();

        Arrays.sort( list );
        enYakinMax = list[list.length-1];
        enYakinMin = list[0];

        for(int i : list){

            if( i < number ){
                if ( enYakinMin < i ){

                    enYakinMin = i ;

                }

            }

            if ( i > number ){
                if ( enYakinMax > i ){

                    enYakinMax = i ;

                }

            }
        }

        System.out.println("Girilen sayidan kucuk En yakin sayi :"+enYakinMin);
        System.out.println("Girilen sayidan buyuk En yakin sayi :"+enYakinMax);


    }



}
