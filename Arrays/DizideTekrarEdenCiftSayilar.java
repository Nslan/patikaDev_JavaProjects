package Giris.Arrays;
public class DizideTekrarEdenCiftSayilar {
    static boolean isThere(int[] array , int value){

        for ( int i: array ) {
            if ( i == value ) return  true;

        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = { 30 , 30 , 8 , 8 , 2 , 10 , 10 , 210 ,210 , 110 , 110 , 2 };

        int[] duplicate = new int[ list.length ];

        int startIndex = 0;

        for ( int i=0; i < list.length; i++ ){

            for (int j=0; j < list.length; j++){

               if (list[i] % 2 == 0 && list[j] % 2 == 0){

                   if( ( i != j ) && (list[i]) == list[j] ){

                       if ( !isThere( duplicate , list[i]) )  {

                           duplicate[startIndex++] = list[ i ];
                       }
                       break;
                   }
               }
            }
        }

        int sum=0;
        for (int i: duplicate
        ) {
            if ( i != 0) System.out.println(i);
            sum+=i;
        }

        if ( sum == 0 ){
            System.out.println("listede cift sayi tekrari yok!");
        }


    }



}
