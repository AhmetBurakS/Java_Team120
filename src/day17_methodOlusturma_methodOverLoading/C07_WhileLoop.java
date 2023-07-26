package day17_methodOlusturma_methodOverLoading;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        /*
            Soru 4 : Main method'da kullanicidan bir sifre isteyip,
            olusturacagimiz bir method'da asagidaki sartlari kontrol edin
            ve method'dan true veya false dondurun

            kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
            tum sartlar saglanincaya kadar tekrar deger isteyin
            ve sartlar saglaninca
            "sifre basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
         */

        boolean sonuc = false;

        while (sonuc == false){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz");
            String sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);

        }

        System.out.println("Sifreniz basariyla kaydedildi");



    }

    public static boolean sifreKontrolEt(String sifre) {

        int sayac = 0;  //hatalari saysin

        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk karakter kucuk harf olmali");
            sayac++;
        }

        char sonKarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonKarakter >= '0' && sonKarakter <= '9')) ;
        {
            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        if (sifre.length() < 10) {
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }

        if (sayac == 0){
            return true;
        }else{
            return false;
        }

    }



}
