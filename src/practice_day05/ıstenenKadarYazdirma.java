package practice_day05;

import java.util.Scanner;

public class ıstenenKadarYazdirma {

    public static void main(String[] args) {

        /*
         * Kullanicidan 3 harften uzun bir kelime ve 10�dan kucuk bir sayi alin,
         * Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime = scanner.next();
        System.out.print("Lutfen bir rakam giriniz: ");
        int rakam = scanner.nextInt();

        String son2harf = kelime.substring(kelime.length()-2);
        if (rakam<=9){
            for (int i = 1; i <= rakam ; i++) {
                System.out.print(son2harf);
            }
        }else{
            System.out.println("Girdiginiz bir rakam degil sayidir.Rakamlar 0,1,2,3,4,5,6,7,8,9 ile sinirlidir"+son2harf);
        }



    }
}
