package sample_questions;

import java.util.Scanner;

public class sample_questions6 {

    public static void main(String[] args) {

        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
                 Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
                 1 şeker = 1.5 gr
                 1 kg = 1000 gram olarak hesaplayın.
                 Ipuclari:
                · Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 gunde kac bardak cay ictiginizi yaziniz ");
        double cay = scan.nextInt();
        System.out.println("Lutfen cayiniza 1 seferde kac seker attiginizi yaziniz ");
        double seker = scan.nextInt();

        double yillikSeker = (cay * (seker*1.5)) *365;
        System.out.println("Yillik tuketilen seker miktari : "+yillikSeker/1000+" kg");




    }
}
