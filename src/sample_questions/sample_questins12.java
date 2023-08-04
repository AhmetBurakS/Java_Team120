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

        sayilarinToplamDegeri();

    }
    public static void sayilarinToplamDegeri (){

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 2 adet sayi giriniz\nsayi 1: ");

        int girilenSayi1 = scan.nextInt();
        System.out.print("sayi 2: ");
        int girilenSayi2 = scan.nextInt();

        int toplam = 0;

        int basamakSayisi = (toplam+"").length();
        int basamakSayisi2 = (girilenSayi2+"").length();
        int basamakSayisi1 = (girilenSayi1+"").length();

        if (basamakSayisi1 >10 && basamakSayisi2>10 && basamakSayisi>10){
            System.out.println("Fazla yuklenme");
        }else{
            System.out.println("Girilen sayilarin toplami: "+(girilenSayi1+girilenSayi2));
        }

    }
}
