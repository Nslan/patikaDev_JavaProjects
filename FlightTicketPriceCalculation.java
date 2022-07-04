package Giris;

import java.util.Scanner;
public class FlightTicketPriceCalculation {
    public static void main(String[] args) {

        double km , sum  ;  int age , type ;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe bilgisi girin :");
        km = input.nextDouble();
        if(  km < 0 ) System.out.println("Hatalı Veri Girdiniz!");
        else {

            System.out.print("Yasinizi girin :");
            age = input.nextInt();
            if( age < 0 ) System.out.println( "Hatalı Veri Girdiniz!");
            else {
                System.out.print("Yolculuk Tipi : Tek Yon ise 1 , Gidis-Donus ise 2 girin :");
                type = input.nextInt();
                if( type != 1 && type != 2 ) System.out.println("Hatalı Veri Girdiniz!");
                else{
                    sum = km  * 0.10 ;

                    if(age<12){

                        sum = ( sum / 2 ); //  12 yas altına %50 indirim

                        if ( type == 2 ) sum = ( sum * 0.8 ) * 2  ; // çift yön oldugu için bilet uzerinden %20 indirim x 2 (çift yon)
                    }
                    else if( (12<age) && (age<24) ){

                        sum = ( sum * 0.9 );// 12< <24 yas aralıgına %10 indirim

                        if (type == 2 ) sum = ( sum * 0.8 ) * 2 ; // çift yön oldugu için bilet uzerinden %20 indirim x 2 (çift yon)
                    }
                    else if ( 65<age ) {

                        sum = ( sum * 0.7 );// 65 yas ustune %30 indirim

                        if (type == 2 ) sum = ( sum * 0.8 ) * 2 ; // çift yön oldugu için bilet uzerinden %20 indirim x 2 (çift yon)
                    }
                    System.out.println("Toplam Tutar :" + sum);
                }
            }
        }
    }
}
