package sample_questions;

import java.util.Scanner;

public class sample_questions15 {

    public static void main(String[] args) {

        /*
            Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
                        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun
                        ve konsolda yazdırın.
                        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.

                        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                                Loopun içerisinde StringM methodlarından  yararlanalım!

         */

        Scanner scanner = new Scanner(System.in);
        String kelime;

        do {
            System.out.println("Lutfen en az 5 harfli bir kelime girin");
            kelime = scanner.nextLine();

        }while(kelime.length()<5);

        String sonUcharf = kelime.substring(kelime.length()-3);
        String yeniKelime = sonUcharf+sonUcharf;

        System.out.println("Yeni olusturulan kelime : "+yeniKelime);

    }
}
