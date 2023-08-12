package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

            // Kullanıcıdan 5 adet sayı alarak bir ArrayList oluşturun.
        // Ardından bu sayıların toplamını hesaplayarak ekrana yazdırın.

        // Örnek çıktı:
        // Toplam: 23

    public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 5 adet sayi giriniz");

        ArrayList<Integer> sayilar = new ArrayList<>();

        int toplam = 0;
        for (int i = 0; i < 5; i++) {

            sayilar.add(scan.nextInt());
        }
        System.out.println("Olusturulan Array List: "+sayilar);

        for (int each: sayilar) {

            toplam+=each;
        }
        System.out.println("Array'deki sayilarin toplami: "+toplam);

    }
}

