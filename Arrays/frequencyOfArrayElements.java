package Giris.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class frequencyOfArrayElements {


    public static void main(String[] args) {

        int[] list = { 10 , 20 , 20 , 10 , 10 , 20 , 5 , 20 };

        Arrays.sort(list);

        int  count;

        for ( int i=0; i < list.length; i++ ){
            count=1;
            for (int j=0; j < list.length; j++){

                if( ( i != j ) && (list[i]) == list[j] ){

                    count++;

                }


            }
            if( i == list.length-1 || list[i] != list[i+1] ){
                System.out.println(list[i]+". eleman "+count+" kadar tekrar ediyor");
            }



        }



    }


}
