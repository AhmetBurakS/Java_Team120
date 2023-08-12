package ProjePracticeAbdullahHoca;

import java.util.Scanner;

public class KahveMakinesi {

    /*
                Basit bir Kahve makinesi oluşturun.
        1. Şart
         3 çeşit kahvemiz olsun.
          Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

          Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
           Örn:
          Hangi Kahveyi İstersiniz?
          1.Türk kahvesi
          2.Filtre Kahve
          3.Espresso
        2.Şart
          Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        3. Şart
          Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
          sorusunu sorsun.
        4. Şart
          Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
          sorusunu sorsun.
        Sonuç
           Siparişlerimizi verdik. Son hali görmek istiyoruz.
                            konsola şunu yazdırın örnek :
                Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi Kahveyi istersiniz?\n1.Turk Kahvesi\n2.Filtre Kahve\n3.Espresso");
        int kahve = scan.nextInt();
        String kahveAdi = "";

        switch (kahve) {
            case 1:
                kahveAdi = "Türk kahvesi";
                break;
            case 2:
                kahveAdi = "Filtre Kahve";
                break;
            case 3:
                kahveAdi = "Espresso";
                break;
            default:
                System.out.println("Uc secenekten birini giriniz");
                return;
        }
        System.out.println("Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)");
        boolean sut = scan.next().equalsIgnoreCase("Evet");
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)");
        boolean seker = scan.next().equalsIgnoreCase("Evet");
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
        String boyut = scan.next();

        String siparis = kahveAdi + " ";
        if (sut)
            siparis += "sütlu ";
        if (seker)
            siparis += "şekerli ";
        siparis += boyut + " boy hazırdır. Afiyet olsun !!!";

        System.out.println(siparis);

    }
}
