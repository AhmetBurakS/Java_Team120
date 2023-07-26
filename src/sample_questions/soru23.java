package sample_questions;

import java.util.Scanner;

public class soru23 {

    public static void main(String[] args) {


        /*
            Soru 23-)
            Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
            Method bize çıktıyı döndürsün.
            Örnek:
            Girdi: 6
            Çıktı: 6!=65432*1=720
            ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen faktoriyel degerini hesaplamak uzere bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        int faktoriyel = faktoriyel(sayi);

        String metin="";
        for (int i = 1; i <= sayi; i--) {
            metin += i+"*";
        }
        System.out.println(sayi+"!"+"="+metin+"="+faktoriyel);


    }

    public static int faktoriyel(int sayi1){

        int faktoriyel= 1;

        for (int i = 1; i <=sayi1 ; i++) {

            faktoriyel*=i;

        }
        return faktoriyel;

    }

}
