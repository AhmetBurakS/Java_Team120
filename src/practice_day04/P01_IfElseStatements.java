package practice_day04;

import java.util.Scanner;

public class P01_IfElseStatements {

    public static void main(String[] args) {

        /*
            Soru: kenar degerleri girilen bir ucgenin dik ucgen olup olmadigini,
            kontrol edip donut veren kod dizisini yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol edilecek ucgenin kenarlarinin uzunluklarini giriniz");
        System.out.print("Birinci kenarin uzunlugu : ");
        int a = scan.nextInt();
        System.out.print("İkinci kenar uzunlugu : ");
        int b = scan.nextInt();
        System.out.print("Ucuncu kenar uzunlugu : ");
        int c = scan.nextInt();
        System.out.println("========================1.Cozum==============================");
        if ((a*a) + (b*b) == (c*c)){
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");
        }else if ((a*a) + (c*c) == (b*b)) {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");
        }else if ((b*b) + (c*c) == (a*a)) {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");
        }else{
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen degildir");
        }

        System.out.println("=======================2.Cozum==================================");
        if ((a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || (b*b) + (c*c) == (a*a)){
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");
        }else{
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen degildir");
        }
    }
}
