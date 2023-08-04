package EXERCİSE;

import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {

        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        icerip icermedigini IndexOf( ) method’u kullanarak yazdirin.

        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
        yazdirin
        - String aranan metni icermiyor
        - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis

         */

        // soru 2 cozumu:

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scan.nextLine();
        System.out.println("Metinde aratacaginiz ifadeyi giriniz");
        String aranacakMetin = scan.nextLine();

        int ilkIndex = metin.indexOf(aranacakMetin);  // -1, dogal sayi
        int sonIndex = metin.lastIndexOf(aranacakMetin);

        if (ilkIndex== -1){
            System.out.println("String aranan metni icermiyor");
        }else if (ilkIndex == sonIndex){
            System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
        }else{
            System.out.println("Aranan metin String’de 1’den fazla kullanilmis");
        }




    }
}
