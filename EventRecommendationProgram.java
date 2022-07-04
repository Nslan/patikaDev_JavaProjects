package Giris;

import java.util.Scanner;

public class EventRecommendationProgram {

    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Sicaklik Giriniz :");
        heat = input.nextInt();


        //System.out.println( (heat<5) ? "kayak" : ( (heat <= 25) ? ( ( (heat<=15) ? ( (heat>=10) ? "Piknik" : "Sinema" ) : "Piknik"   )  ) : "yuzme" ) );

        //System.out.println( (heat<5) ? "kayak" : ( (heat <= 25) ? ( ( (heat<=15) &&  (heat>=10) ) ? "Piknik\nSinema" : ( ( (heat>=15) &&  (heat>=10) )  ? "Piknik" : ( ( (heat<=15) &&  (heat<=10)  ) ? : "Sinema" : "yuzme" )  : "yuzme" );

        System.out.println( (heat<5) ? "kayak yapabilirsin" : ( (heat <=15) ? "Sinemaya gidebilirsin": ( (heat<=25) ? "Piknige gidebilirsin" : "Yuzmeye gidebilirsin" ) ) );
    }

}
