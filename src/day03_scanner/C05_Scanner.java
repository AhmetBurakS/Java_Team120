package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {


        // kullanıcıdan bir dikdirtgenin 2 kenar uzunluğunu alip,
        // dikdirtgenin alanını yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdirtgenin alani : " + kenar2*kenar1);
    }
}
