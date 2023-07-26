package day08_ifelseStatements;

import java.util.Scanner;

public class C05_vucutkitleendeksi {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Boyunuzu cm olarak giriniz");
        double boy = scanner.nextDouble();


        double vke = kilo*10000 / (boy * boy);


        if (vke >= 30) {
            System.out.println("obez");
        } else if (vke >= 25) {
            System.out.println("Kilolu");
        } else if (vke >= 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Zayif");
        }




    }
}
