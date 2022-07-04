package Giris;
import java.util.Scanner;

public class WhileIleUserLoginKontrolu {

    public static void main(String[] args) {

        String password1 = "123456" , password2  ;
        boolean isPasswordSuccess = false ;

        Scanner input = new Scanner(System.in);


        while ( ! isPasswordSuccess ){ // veya isPassword != false

            System.out.print("Parola gir : ");
            password2 = input.nextLine();

            if( password2.equals(password1) ){
                System.out.println("Giris Yapildi:");
                isPasswordSuccess = true ;
            }else {
                System.out.println("Sifre yanlis Tekrar deneyin!");
            }

        }


    }

}
