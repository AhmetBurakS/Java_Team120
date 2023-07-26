package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //soru: kullanıcıdan bir double birde int sayi alip bunların toplamını ve çarpımını yazdırın.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir double sayi giriniz");

        double girilenDouble = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenInt = scanner.nextInt();

        System.out.println("İki sayinin toplami :" + (girilenInt + girilenDouble));
        System.out.println("İki sayinin carpimi :" + girilenDouble * girilenInt);





























    }
}
