package Giris;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName , password ,  newpassword;
        int select ;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username:");
        userName = input.nextLine();

        System.out.print("Enter password:");
        password = input.nextLine();

        if ( userName.equals("patika") && password.equals("java123") ){
            System.out.println("you are logged in");
        }else{
            System.out.println("Incorrect password!");
            System.out.println("Do you want to reset your password!\n\tPlease choose : press Yes(1) or No(0)");
            select = input.nextInt();

            if( select == 1 ){
                System.out.println("your password is reset...");
                System.out.print("Please enter new password :");
                newpassword = input.next();

                if ( !newpassword.equals("java123")) {
                    System.out.println("your new password is create...");
                    System.out.println("\t\tSuccessfully created Password!");
                }else{
                    System.out.println("Could not create password, please enter another password!");
                    System.out.print("Please enter new password :");
                    newpassword = input.next();
                    if ( !newpassword.equals("java123") ) {
                        System.out.println("your new password is create...");
                        System.out.println("\t\tSuccessfully created Password!");
                    }else{
                         System.out.println("Could not create password, please enter another password!");
                    }
                }
            }else if( select ==0 ){
                System.out.println("back to login page!");
            }else{
                System.out.println("not understood");
            }
        }
    }

}
