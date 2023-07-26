package sample_questions;

import java.util.Scanner;

public class sample_questions1 {

    public static void main(String[] args) {

        /*
            Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
            Ipuclari:
            * r=7;
            * Pi=3.14
            * Dairenin Cevresi : 2*Pi*r
            * Dairenin Alani : Pi*r*r
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dairenin yaricapini giriniz");
        double yaricap = scan.nextDouble();
        double pi = 3.14;

        System.out.println("Dairenin cevresi : "+(2 * pi *yaricap));
        System.out.println("Dairenin Alani : "+(3.14 * yaricap*yaricap));
    }
}
