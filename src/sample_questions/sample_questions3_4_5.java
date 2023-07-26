package sample_questions;

import java.util.Scanner;

public class sample_questions3_4_5 {

    public static void main(String[] args) {

        /*
        Soru 3-)   SCANNER
                Kullanicidan 5 tane sayi alin,
                alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
         */



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ortalamasi hesaplanacak 5 sayiyi sirasiyla giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        double sayi5 = scan.nextDouble();

        System.out.println("Girilen 5 sayinin ortalamasi :"+(sayi1+sayi2+sayi3+sayi4+sayi5)/5);


        /*
            Soru 4-)   SCANNER
            Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
         */


        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();
//
        System.out.println("Girilen sayinin kupunun yarisi :"+(sayi*sayi*sayi)/2);


        /*
        Soru 5-)   SCANNER
                Kullanıcıdan karenin kenar uzunluğunu alın.
                Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
                Ipuclari:
                Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)
         */


        System.out.println("Lutfen alani ve cevresi hesaplanacak karenin kenar uzunlugunu giriniz");
        double kenar = scan.nextDouble();

        System.out.println("Kenar uzunlugu girilen karenin alani :"+ kenar*kenar);
        System.out.println("Kenar uzunlugu girilen karenin cevresi :"+4*kenar);









    }
}
