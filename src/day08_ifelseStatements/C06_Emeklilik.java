package day08_ifelseStatements;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E: Erkek , K: Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E' && yas>=65) {
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet== 'E' && yas<65) {
            System.out.println("Erkek emekli olamaz, "+(65-yas) + "yil daha calismalisiniz" );
        }else if (cinsiyet== 'K' && yas >=60) {
            System.out.println("Kadin emekli olabilir");
        }else if (cinsiyet == 'K' && yas <60 ) {
            System.out.println("Kadin emekli olamaz , " + (60 -yas)+ "Yil daha calismalisiniz");
        }
    }
}
