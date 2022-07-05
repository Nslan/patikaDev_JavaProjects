package Giris;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1 , n2  , temp;
        Scanner input = new Scanner(System.in);


        System.out.println("1. sayiyi girin : ");
        n1 = input.nextInt();

        System.out.println("2. sayiyi girin : ");
        n2 = input.nextInt();

        int ebob = 1 ;

        // iki sayının ebobu en fazla kucuk sayıya esittir yani dongu iki sayının ortak bolenlerıne bakarken en kuuck sayıya kadar bakmalıdır
/*
        temp = ( n1 < n2 ) ? n1 : n2 ; // hangisi kucukse onu temp e ata

        int i=1;
        while ( i <= temp ){

            if( n1 % i == 0 && n2 % i ==0 ){

                ebob = i ;
            }

            i++;

        }
*/

        // ebob bulunurken yukardan asagıya dogru ortak bolenleri bulmak daha mantıklıdır dongu ilk buldugu en buyuk ortak bolende donguden cıkılır boylece daha az donmus olur
        temp = ( n1 < n2 ) ? n1 : n2 ; // hangisi kucukse onu temp e ata

        int i=temp;
        while ( i >= 1 ){

            if( n1 % i == 0 && n2 % i ==0 ){

                ebob = i ;
                break;// kucuk sayıdan 1 dogru sayarken ilk bulunan en buyuk ortak bolende donguden cık
            }

            i--;

        }


        System.out.println(n1+" , " + n2 + " nin ebobu : "+ebob);

        System.out.println(temp);

        // ekok en iyi ihtimalle buyuk olan sayıdır
        // en kotu ise iki sayının carpımıdır
        // bu yuzden ekok bulunurken en buyuk sayı ve iki sayının carpımları arasına bakılmalıdır
        // ekok :  max_sayı <= ekok(max,min) <= (max * min) dir
        temp = (n1 > n2 ) ? n1 : n2 ;
        int j = temp ;
        int ekok = 1;
        int multiply = n1 * n2 ; 
        while ( j <= multiply ){
            if ( j % n1 == 0 && j % n2 == 0 ){
                ekok = j ;
                break;
            }
            j++;
        }

        System.out.println(n1+" , " + n2 + " nin ekoku : "+ekok);
        


    }
}
