package sample_questions;

import java.util.Scanner;

public class sample_questions8 {

    /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
                ipuclari:
                Matematiksel Islemler konusuna bakalim.
                Bölme islemi kullanarak sayinin basamaklarini alalim
                ve toplam adli bir konteynira (Variable) atalim.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = sayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;
        sayi = sayi / 10 ;

        birlerBasamagi = sayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;
        sayi = sayi / 10 ;

        birlerBasamagi = sayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;
        sayi = sayi / 10 ;


        System.out.println("Girilen sayinin rakamlar toplami :"+rakamlarToplami);



    }


}
