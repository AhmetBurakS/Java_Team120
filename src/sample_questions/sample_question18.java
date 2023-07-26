package sample_questions;

import java.util.Scanner;

public class sample_question18 {

    public static void main(String[] args) {

        /*
            Soru 18-) Method Sorusu
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aracinizin hizini giriniz");
        double hiz = scanner.nextDouble();
        System.out.println("Lutfen varacaginiz yere olan uzakliginizi kilometre olarak yaziniz");
        double kmYol = scanner.nextDouble();

        double varisSuresi = gidilenYereVarisSuresi(hiz,kmYol);

        System.out.println("Varış süreniz: " + varisSuresi + " saat");

    }

    public static double gidilenYereVarisSuresi (double hiz, double kmYol){

            return kmYol/hiz;
    }
}
