package practice_day04;

import java.util.Scanner;

public class P02_ternaryOperator {

    public static void main(String[] args) {

        /*
            Soru: Kenar degerleri verilen ucgenin ikizkenar ucgen olup olmadigini kontrol edip
                  donut veren kod dizisini yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz ucgenin kenar degerlerini giriniz");
        System.out.println("Kenar -1: ");
        double kenar1 = scan.nextDouble();
        System.out.println("Kenar-2: ");
        double kenar2 = scan.nextDouble();
        System.out.println("Kenar-3: ");
        double kenar3 = scan.nextDouble();

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 ?
                (kenar1 == kenar2 || kenar1==kenar3 || kenar2==kenar3?
                "Girdiginiz degerler bir ikizkenar ucgene aittir": "Girdiginiz ucgen ikizkenar degildir"):
                "Yanlis deger girdiniz");

    }
}
