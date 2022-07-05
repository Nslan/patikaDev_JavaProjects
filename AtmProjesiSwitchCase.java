package Giris;

import java.util.Scanner;

public class AtmProjesiSwitchCase {
    public static void main(String[] args) {

        String userName , password;
        int balance = 1500 , price ;

        Scanner scanner = new Scanner(System.in);


        int right=3;//3 kez yanlıs girerse hesabı bloke et
         int select ; // kullanıcı hangi işlemi secdigini kontrol edeceğiz
            int sec;
        do {

            System.out.print("Kullanici Adiniz:");
            userName = scanner.nextLine();
            System.out.print("Sifreniz :");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("1234") ){
                System.out.println("Merhaba CodeCrown Bank Sistemine Hos Geldiniz...");
                do {

                    System.out.println("1 - Para Yatirma\t" + "\t5 - Hesap Bilgileri\n" +
                            "2 - Para Cekme\t" + "\t\t6 - Diger Odemeler\n" +
                            "3 - Bakiye Sorgula\t" + "\t7 - Havale/EFT\n" +
                            "4 - Cikis Yap"
                    );
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = scanner.nextInt(); // kullanıcı hangi işlemi secdigini kontrol edeceğiz

                    switch ( select ){

                        case 1 :
                            System.out.println("Para miktari : ");
                            price = scanner.nextInt();
                            balance += price ;
                            break;
                        case 2 :
                            System.out.println("Para miktari : ");
                             price = scanner.nextInt();
                            System.out.println( (price > balance) ? "Bakiye yetersiz" : ( balance-=price ) );
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        case 5 :
                            System.out.println("Hesap numarasi : " + "\nTelefon numarasi : " + "\nAd Soyad : " + "\nBakiye Miktari :" + "\nLimit :");
                            break;
                        case 6 :
                            System.out.println("1 - Kredi Karti odemeleri : " + "\n2 - Vergi Odemeleri : " + "\n3 - Fatura Odemeleri : " + "\n4 - Egitim Odemeleri :" + "\n5 - Borc Odemeleri :");
                            System.out.print("Seciniz ? :");
                            sec = scanner.nextInt();
                            switch ( sec ){
                                case 1 :
                                    System.out.println("Suan da islem yapılamıyor!");
                                    System.out.println("Ana menuye donus yapiliyor");break;
                                case 2 :
                                    System.out.println("Suan da islem yapılamıyor!");
                                    System.out.println("Ana menuye donus yapiliyor");break;
                                case 3 :
                                    System.out.println("Suan da islem yapılamıyor!");
                                    System.out.println("Ana menuye donus yapiliyor");break;
                                case 4 :
                                    System.out.println("Suan da islem yapılamıyor!");
                                    System.out.println("Ana menuye donus yapiliyor");break;
                                case 5 :
                                    System.out.println("Suan da islem yapılamıyor!");
                                    System.out.println("Ana menuye donus yapiliyor"); break;
                                default:
                                    System.out.println("Anlasilamadi!");
                            }
                            break;
                        case 7 :
                            System.out.println("1 - Hesaba Havale\n" + "2 - Kredi Kartına EFT");
                            System.out.print("Seciniz ? : ");
                            sec = scanner.nextInt();
                            switch (sec){
                                case 1 :
                                    System.out.println("Alicinin Hesap numarasi :");
                                    System.out.println("Alicinin Ad Soyad :");
                                    System.out.println("Gonderilecek miktar :");

                                    System.out.println("Ana menuye donus yapiliyor");
                                    break;
                                case 2 :
                                    System.out.println("Alicinin Kart Numarasi :");
                                    System.out.println("Alicinin Adi Soyad :");
                                    System.out.println("Gonderilecek miktar :");

                                    System.out.println("Ana menuye donus yapiliyor");
                                    break;
                            }
                            break;
                        default:
                            System.out.print("Girilen komut anlasilmadi!Tekrar secim yapin :\n");
                    }

                }while ( select != 4 );
                System.out.println("Cikis yapiliyor!");
                break;//esitlik saglanıyorsa tum donguden çık
            }else {
                System.out.println("Hatalı kullanıcı adı veya sifre. Tekrar deneyiniz");
                System.out.println("Kalan Hakkınız :"+--right);
                if(right == 0){
                    System.out.println("Hesabınız bloke olmustur! Lütfen banka ile iletisime gecin");
                }

            }

        }while(right>0);



    }
}
