package day03_scanner;

import java.util.Scanner;

public class C07_Swap {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");

        int ilkSayi= scanner.nextInt();


        System.out.println("Lutfen ikinci sayiyi giriniz");

        int ikinciSayi= scanner.nextInt();


        int temp = ilkSayi;
        ilkSayi = ikinciSayi;
        ikinciSayi = temp;


        System.out.println("İlk sayinin yeni degeri : "+ ilkSayi);
        System.out.println("İkinci sayinin yeni degeri: "+ ikinciSayi);


        // Ucuncu bir degisken olmadan iki sayinin yerini degitirme (swap)

        int x = 13;
        int y = 7;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x :" + x + " y :" + y );




    }
}
