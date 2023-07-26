package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplamak uzere pozitif sayilar isteyin
        // kullanici islemi bitirmek icin 0'a basmalidir
        // kullanici 0'a bastiginda kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin

        // once while loop ile yapalim

        /*Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi = 99999;


        while (girilenSayi != 0){

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi;
                sayac++;
            }

        }


        System.out.println("Girilen "+sayac+ " adet sayinin toplami : "+toplam);

         */

        // do while ile yapalim

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi;

        do { scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi;
                sayac++;
            }


        }while (girilenSayi != 0);

        System.out.println("Girilen "+sayac+ " adet sayinin toplami : "+toplam);
    }
}
