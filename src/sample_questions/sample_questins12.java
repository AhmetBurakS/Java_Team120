package sample_questions;

import java.util.Scanner;

public class sample_questins12 {

    public static void main(String[] args) {

        /*
            Soru 12-)
            Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
            hesaplamak ve yazdırmak için bir program oluşturalım
            Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
            Ipucu:  IF/Else kullanabilirsiniz.
            Örnek:
            İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
            Konsolda Çıktı :
            Sayıların toplamı: 71  veya  Fazla Yüklenme
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 2 adet tamsayi giriniz\n1 :");
        long sayi1 = scanner.nextLong();
        System.out.print("2 :");
        long sayi2 = scanner.nextLong();
        long toplam = sayi1+sayi2;

        String sayi1Basamak = String.valueOf(sayi1);
        String sayi2Basamak = String.valueOf(sayi2);
        String basamakToplam = String.valueOf(sayi1) + String.valueOf(sayi2);

        if (sayi1Basamak.length()>10 || sayi2Basamak.length()>10){
            System.out.println("Fazla Yuklenma");
        }else if (basamakToplam.length()>10){
            System.out.println("Fazla Yuklenme");
        }else{
            System.out.println("Girilen sayilarin toplami : "+ toplam);
        }





    }
}
