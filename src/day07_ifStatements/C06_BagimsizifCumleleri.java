package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizifCumleleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 ==0 || girilenSayi % 5 ==0) System.out.println("Guzel sayi");
    }
}
