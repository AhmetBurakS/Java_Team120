package day05_MatematikselIslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {


        // kullanicidan 3 basamakli bir sayi alip sayinin rakamlarini toplayip yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0 ;
        int rakamlarToplami = 0;

        // ilk sayi icin birler basamagini bulalim


        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        // birler basamagindaki sayiyi aldik, artik ondan kurtulalim
        girilenSayi = girilenSayi / 10 ;


        // bu satira geldiğimizde girilen sayiyi 2 basamakli hale donusturduk

        birlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;


        // buraya geldigimizde artik sayimiz tek basamakli

        birlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;


        System.out.println("Rakamlar toplami : " + rakamlarToplami) ;













    }
}
