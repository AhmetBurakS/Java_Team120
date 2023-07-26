package day04_DataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {

    public static void main(String[] args) {


        // Kullanicidan bir char isteyin
        // girilen char'dan sonraki 3 karakteri yazdirin
        // Orn : input : a   output: b,c,d

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir char karakter giriniz");

        char girilenChar = scanner.next().charAt(0);
        // scanner.nextChar() metodu olmadigindan
        // once .next() ile String olarak alip, sonra o String'in ilk karakterini alalim.

        System.out.println("Girilen karakter :" + girilenChar);
        System.out.println("Girilen karakterden sonraki 3 karakter" +
                (char)(girilenChar+1) +"," +
                (char)(girilenChar+2) +"," +
                (char)(girilenChar+3));


    }
}
