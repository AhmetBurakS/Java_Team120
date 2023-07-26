package day08_ifelseStatements;

import java.util.Scanner;

public class C03_ifelseifstatements {

    public static void main(String[] args) {


        /* Bir if - else if - else... statement else ile bitmek zorunda degildir.
           else ile biten kodlar, her durum icin mutlaka bir sonuc uretirler.

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not >= 85 ) {
            System.out.println("AA");
            } else if (not>=65) {
            System.out.println("BB");
        }else if (not>=50) {
                System.out.println("CC");
            } else {
                System.out.println("DD");
            }


        }


    }

