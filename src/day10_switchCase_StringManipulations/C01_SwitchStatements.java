package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlamini gormek istddiginiz harfi giriniz");

        char harf = scan.next().toUpperCase().charAt(0);


        switch (harf) {

            case 'I' :
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("Software");
                break;
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
                System.out.println("Qualification");
                break;
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("yazdıgınız harf ISTQB'de yok");

        }


    }
}
