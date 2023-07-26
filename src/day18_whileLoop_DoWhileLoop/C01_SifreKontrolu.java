package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolu {

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

        /*
            Bu soruyu day17'de cozduk
            ama java'da daha profesyonel kodlama icin
            iki duzeltme yapacagiz

            1-
            while loop'un onundeki parantezin ici
            true oldugu muddetce loop calisir

            bu soruda sonuc veriable'i da boolean deger iceriyor
            ama sorunun mantigi acisindan
            sonuc false oldugu muddetce loop calismali

            2-
            while loop her calistiginda
            Scanner scanner = new Scanner(System.in);
            String sifre = scanner.nextLine();
            calisiyor ve yeni bir obje olusturuyor

            bunun yerine daha guzel olani
            lop'dan once objeyi olusturup
            loop'un icerisinde sadece deger atamasi yapmaktir
         */



        boolean sonuc = false;
        Scanner scanner;
        String sifre;

        while (!sonuc){  // sonuc == false

            scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();
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
