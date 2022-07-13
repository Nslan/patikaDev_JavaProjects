package Giris.Arrays;

public class HarmonikOrtalama {

    public static void main(String[] args) {

        int[] list = { 1, 2, 3, 4, 5 };
        double sum = 0.0 ;
        for ( int i=0; i< list.length; i++){
            sum+= 1 / (double) list[i];
        }


        System.out.println(sum);
    }

}



