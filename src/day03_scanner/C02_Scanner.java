package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {


        // Scanner ile kullanıcıdan bir bilgi almak istersek 3 adımda alabiliriz.
        // 1.adım: scanner objesi oluşturmak

        Scanner scanner = new Scanner(System.in);

        // 2.adım: kullanıcıya ne istediğinizi söyleyin.
        // kullanıcıdan bir tamsayı alıp onun karesini yazdırın.

        System.out.println("lütfen bir tamsayı giriniz");

        // 3.adım: istediğiniz datanın türüne uygun bir veriable oluşturun.
        // ve scanner objesini kullanarak uygun metodla kullanıcının girdiği değeri alın.


        int girilenSayi = scanner.nextInt();

        //artık kullanıcının girdiği sayı kod ortamımıza kaydedildi.
        // bu veriableyi istediğimiz şekilde kullanabiliriz.

        System.out.println("girilen sayinin karesi: " +girilenSayi*girilenSayi);
    }
}
