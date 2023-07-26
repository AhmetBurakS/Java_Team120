package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C01_Emeklilik2inciCozum {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E: Erkek , K: Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (cinsiyet== 'K') {
            if (yas<0 || yas>90) {
                System.out.println("yas girisi gecersiz");
            }else if (yas<60) {
                System.out.println("emekli olmak icin daha " + (60-yas) + "yil calismalisin");
            }else {
                System.out.println("emekli olabilirsin");
            }


        } else if (cinsiyet== 'E') {

            if (yas<0 || yas>90) {
                System.out.println("yas girisi gecersiz");
            }else if (yas<60) {
                System.out.println("emekli olmak icin daha " + (65-yas) + "yil calismalisin");
            }else {
                System.out.println("emekli olabilirsin");

        }

        }else {
            System.out.println("cinsiyet girisi hatali");
        }





    }
}
