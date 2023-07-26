package sample_questions;

import java.util.Scanner;

public class sample_questions16 {

    public static void main(String[] args) {

        /*
            Soru 16-)
            Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
            -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
            -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
            Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
            Örn:
                 isim1= masa
                 isim2= ali
                 Konsol => maalisa
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir adet isim giriniz");
        String isim1 = scanner.nextLine();
        System.out.println("Lutfen bir adet daha isim giriniz");
        String isim2 = scanner.nextLine();

        if (isim1.length() % 2 == 0){

            int ortaIndex = isim1.length()/2;
            String birinciKisim = isim1.substring(0,ortaIndex);
            String ikinciKisim = isim1.substring(ortaIndex);
            String yeniIsim = birinciKisim+isim2+ikinciKisim;

            System.out.println("Sonuc : "+yeniIsim);

        }else{
            System.out.println("isim2, isim1'e eklenemez");
        }


















    }
}
