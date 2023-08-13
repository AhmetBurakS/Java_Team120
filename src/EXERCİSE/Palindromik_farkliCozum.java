package EXERCİSE;

import java.util.Scanner;

public class Palindromik_farkliCozum {

     /*
    Örnek Soru: Kullanıcıdan bir kelime veya cümle girmesini isteyen ve bu kelimenin veya
    cümlenin palindrom olup olmadığını (ters çevrildiğinde kendisiyle aynı olan) kontrol eden
     bir Java programı yazınız.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime veya bir cumle giriniz");
        String metin = scan.nextLine();

        boolean palindromMu = kontrol(metin);
    }

    public static boolean kontrol(String metin) {

        String tersMetin = new StringBuilder(metin).reverse().toString();
        return metin.equalsIgnoreCase(tersMetin);
    }


}
