package practice_day06;

import java.util.Scanner;

public class methodCreation2 {

    public static void main(String[] args) {

        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz :");
        String isim = scan.nextLine();
        System.out.print("Lutfen soyisminizi giriniz :");
        String soyisim = scan.nextLine();
        System.out.println(isimSoyisimYazdir(isim,soyisim));




    }

    private static String isimSoyisimYazdir(String isim, String soyisim) {

        isim = isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        soyisim= soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase();
        String duzenliIsim = isim+ " "+soyisim;
        return duzenliIsim;


    }

}
