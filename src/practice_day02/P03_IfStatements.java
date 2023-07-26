package practice_day02;

import java.util.Scanner;

public class P03_IfStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       //System.out.println("Lutfen gun ismini giriniz");
       //String gun = scan.next().toLowerCase();
       //
       //if (gun.equals("cumartesi") || gun.equals("pazar")) {
            //System.out.println("Bu gun haftasonu");
        //}

        System.out.println("Lutfen adinizi giriniz");
        String name = scan.nextLine();
        System.out.println("Lutfen Soyadinizi giriniz");
        String surname = scan.nextLine();
        System.out.println("Lutfen vize ve final notlarinizi sirasiyla giriniz");
        System.out.println("1.Vize: ");
        double vize1 = scan.nextDouble();
        System.out.println("2.Vize: ");
        double vize2 = scan.nextDouble();
        System.out.println("Final notu: ");
        double finalNotu = scan.nextDouble();
        double yilSonuNotu = ((((vize1+vize2)/2)*40/100) + (finalNotu*60/100));

        System.out.println("Adiniz: "+name);
        System.out.println("Soyadiniz: "+    surname);
        System.out.println("1. vize notu:" + vize1);
        System.out.println("2. vize notu:" + vize2);
        System.out.println("Final notu: "+ finalNotu);
        System.out.println("Yil sonu notu: " +yilSonuNotu);

        if (yilSonuNotu>=50) {
            System.out.println("gectiniz");
        }

        if (yilSonuNotu<50) {
            System.out.println("malesef kaldiniz");
        }









    }
}
