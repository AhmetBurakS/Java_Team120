package day02_dataTurleri_veriable;

import java.util.Locale;

public class C04_StringDataTuru {

    public static void main(String[] args) {


        int sayi =20;

        System.out.println(sayi);

        String isim = "Berk Yılmaz";

        System.out.println(isim.toUpperCase()); //BERK YILMAZ

        System.out.println(isim.toLowerCase());

        System.out.println(isim);

        String str1= "Java";
        String str2= " Candir";

        System.out.println(str1+str2);
        // 2 tane String + işaretiyle toplanmaya çalışılırsa
        // Java o iki Stringi birleştirir

        String str3 = "30";
        String str4= "40";

        System.out.println(str3+str4);  //3040

        // verilen isim ve soyismi
        // girilen ali uzunkavak database'e kaydedildi
        //şeklinde yazdırın

        String adi = "Ramazan";
        String soyadi= "tatar";

        System.out.println("girilen"+ adi + " " + soyadi + "database'e kaydedildi");




    }
}
