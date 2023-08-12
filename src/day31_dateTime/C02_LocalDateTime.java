package day31_dateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);  // 2023-08-04 T 21:10:44.742678

        // bir for loop olusturup 1'den 10000'e kadar olan sayilari toplayin
        // islem suresini nano saniye olarak yazdirin

        LocalDateTime baslamaZamani = LocalDateTime.now();
        int baslangicZamani = baslamaZamani.getNano();

        int toplam = 0;
        for (int i = 1; i <10000 ; i++) {

            toplam += i;
        }

        LocalDateTime bitirmeZamani = LocalDateTime.now();
        int bitisZamani = bitirmeZamani.getNano();

        System.out.println("Islem suresi : "+ (bitisZamani-baslangicZamani));  // Islem suresi : 447000

    }
}
