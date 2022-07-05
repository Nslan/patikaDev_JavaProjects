package Giris;

public class AsalSayılar {

    public static void main(String[] args) {



        for(int sayi=2;sayi<=100;sayi++){

            boolean control = false;
            for ( int j=2; j<sayi; j++){

                if ( sayi % j == 0 ){//sayi birkez bile bolunebiliyorsa true dondur ve artık kontrol yapma
                    control = true ;
                    break;
                }else{
                    control = false;
                }

            }
            if (control == false){
                System.out.print(sayi+" ");

            }

        }




    }
}
