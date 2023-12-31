package sample_questions;

import java.util.Scanner;

public class sample_questions11 {

    public static void main(String[] args) {

        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                    Ipucu: IF ile çözebilirsiniz.
                    ALİ
                    Giriş :
                             > Gandalf Grey 563245879632
                    Çıktı :
                             > İsim : G****** G***
                             > CCN : **** **** 9632
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        System.out.println("Lutfen kredi karti numaranizi giriniz");
        String krediKarti= scanner.nextLine();

        String yeniIsim = isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase();
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).toLowerCase();

        if (krediKarti.length() !=16){
            System.out.println("Gecersiz kredi karti numarasi girisi");
        }else{
            System.out.println("İsim :"+yeniIsim.charAt(0)+yeniIsim.substring(1).
                                replaceAll("\\w","*")+" "+yeniSoyisim.charAt(0)+
                                yeniSoyisim.substring(1).replaceAll("\\w","*")+"\n"+
                                "Kredi Karti No: "+krediKarti.substring(0,4).replaceAll("\\d","*")+
                                " "+krediKarti.substring(4,8).replaceAll("\\d","*")+" "+krediKarti.
                                substring(12,16));

        }


    }
}
