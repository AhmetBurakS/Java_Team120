package sample_questions;

import java.util.Scanner;

public class sample_questions17 {

    public static void main(String[] args) {


        /*
            Soru 17-)
            Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
            Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.

            İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise
            konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
            Ipucu:
            IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir isim giriniz");
        String isim = scanner.nextLine();

        int uzunluk = isim.length();


        if (uzunluk == 3){

            char birinciKarakter = isim.charAt(0);
            char ikinciKarakter = isim.charAt(1);
            char ucuncuKarakter = isim.charAt(2);

            if (birinciKarakter==ikinciKarakter || birinciKarakter==ucuncuKarakter || ikinciKarakter==ucuncuKarakter){
                System.out.println("Dize yinelenen karakterlere sahip");
            }else{
                System.out.println("Dize benzersiz karakterlere sahip");
            }

        }else{
            System.out.println("Gecersiz isim girisi");
        }


    }
}
