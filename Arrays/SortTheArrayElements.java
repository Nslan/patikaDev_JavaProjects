package Giris.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArrayElements {

    public static void main(String[] args) {

        int value , value2 , arr[] ;
        Scanner input =new Scanner(System.in);

        System.out.print("Dizinin Boyutunu giriniz n :");
        value = input.nextInt();
        arr = new int[ value ];

        System.out.println("Dizinin elemanlarini giriniz : ");
        for ( int i = 0 ;  i < value ; i++ ) {

            System.out.print( (1 + i)+".inci elemani giriniz : ");
            value2 = input.nextInt();
            Arrays.fill( arr , i , i+1 ,  value2 );
        }

        for ( int i=0; i<value ; i++ ) {
            System.out.println((i + 1)+".inci elemani : "+arr[i] );
        }

        Arrays.sort(arr);
        System.out.print( "Siralama : " );
        for (int i: arr
             ) {
            System.out.print(i+" ");
        }

    }

}
