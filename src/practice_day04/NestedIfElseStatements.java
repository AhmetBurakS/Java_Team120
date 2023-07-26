package practice_day04;

import java.util.Scanner;

public class NestedIfElseStatements {

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

        if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0){
            if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3){
                System.out.println("Girdiginiz degerler bir ikizkenar ucgene aittir");
            }else{
                System.out.println("Girdiginiz degerler bir ikizkenar ucgene ait degildir");
            }
        }else{
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}
