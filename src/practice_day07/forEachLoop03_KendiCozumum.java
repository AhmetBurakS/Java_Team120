package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop03_KendiCozumum {

    // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
    // Bu notların ortalamasını hesaplayarak ekrana yazdırın.

    // Örnek çıktı:
    // Notların ortalaması: 78.5

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notlarinizi 5 adet olacak sekilde giriniz");
        double not1 = scan.nextDouble();
        double not2 = scan.nextDouble();
        double not3 = scan.nextDouble();
        double not4 = scan.nextDouble();
        double not5 = scan.nextDouble();

        ArrayList<Double> notlar = new ArrayList<>();
        notlar.add(not1);
        notlar.add(not2);
        notlar.add(not3);
        notlar.add(not4);
        notlar.add(not5);

        double notOrtalamasi = 0;

        for (Double each: notlar) {

            notOrtalamasi+= each;

        }
        notOrtalamasi = notOrtalamasi/5;

        System.out.println(notOrtalamasi);

    }


}
