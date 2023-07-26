package day08_ifelseStatements;

import java.util.Scanner;

public class C07_Nestedifelsestatements {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E: Erkek , K: Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();


        if (cinsiyet == 'E') {

            if (yas<0 || yas>100) {
                System.out.println("gecersiz yas girisi");
            } else if (yas >= 65) {
                System.out.println("Erkek emekli olabilir");
            } else {
                System.out.println("emekli olmak icin daha " + (65-yas) + "yil calismalisin");
            }


        } else if (cinsiyet == 'K') {

            if (yas<10 || yas>80) {
                System.out.println("gecersiz yas girisi");
            } else if (yas>=60) {
                System.out.println("kadin emekli olabilir");
            } else {
                System.out.println("emekli olmak icin daha " + (60-yas) + "yil calismalisin");
            }


        } else {
            System.out.println("Cinsiyet hatali girildi");
        }
    }
}
