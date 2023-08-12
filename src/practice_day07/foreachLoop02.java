package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class foreachLoop02 {

            // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
        // Bu fiyatların toplamını hesaplayarak ekrana yazdırın.

        // Örnek çıktı:
        // Toplam fiyat: 236.5

    public static void main(String[] args) {

        ArrayList<Double> urunFiyatlari = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. urunun satis fiyatini giriniz");
        double urun1 ;
        urunFiyatlari.add(scan.nextDouble());
        System.out.println("Lutfen 2. urunun satis fiyatini giriniz");
        double urun2 ;
        urunFiyatlari.add(scan.nextDouble());
        System.out.println("Lutfen 3. urunun satis fiyatini giriniz");
        double urun3 ;
        urunFiyatlari.add(scan.nextDouble());
        System.out.println("Lutfen 4. urunun satis fiyatini giriniz");
        double urun4 ;
        urunFiyatlari.add(scan.nextDouble());

        double toplam = 0;

        for (Double each: urunFiyatlari
             ) {
            toplam += each;

        }
        System.out.println("Girdiginiz urunlerin fiyatlarinin toplami: "+toplam);
    }


}