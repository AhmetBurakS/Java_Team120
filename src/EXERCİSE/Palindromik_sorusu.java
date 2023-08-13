package EXERCİSE;

import java.util.Scanner;

public class Palindromik_sorusu {

      /*
    Örnek Soru: Kullanıcıdan bir kelime veya cümle girmesini isteyen ve bu kelimenin veya
    cümlenin palindrom olup olmadığını (ters çevrildiğinde kendisiyle aynı olan) kontrol eden
     bir Java programı yazınız.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime veya cumle giriniz");
        String girilenMetin = scan.nextLine();


        String tersMetin = "";
        for (int i = girilenMetin.length()-1; i >= 0; i--) {

            tersMetin += girilenMetin.charAt(i);
        }


        if (girilenMetin.equals(tersMetin)){
            System.out.println("Girmis oldugunuz metin palindromik bir metindir");
        }else{
            System.out.println("Girmis oldugunuz metin palindromik bir metin degildir");
        }

    }
}
