package sample_questions;

import java.util.Scanner;

public class sample_questions9 {

    public static void main(String[] args) {

        /*
            Soru 9-)  Girilen zamanı saniyeye çeviriniz.
               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen zamani saat-dakika-saniye olarak giriniz");
        System.out.println("Lutfen saati giriniz");
        int saat = scan.nextInt();
        System.out.println("Lutfen dakikayi giriniz");
        int dakika = scan.nextInt();
        System.out.println("Lutfen saniyeyi giriniz");
        int saniye = scan.nextInt();

        System.out.println("Girilen zamanin saniye olarak karsiligi :"+(saat*3600)+(dakika*60)+saniye);

    }
}
