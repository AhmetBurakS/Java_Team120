package practice_day04;

import java.util.Scanner;

public class P06_forLoop {

    /*
        Kullanicidan pozitif bir tamsayi alalim ve 1'den o sayiya kadar olan sayilardan
        4 ile bolunebilenleri yazdirin
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi <= 0){
            System.out.println("Yanlis giris yaptiniz.Lutfen pozitif bir tamsayi giriniz ");
        }

        for (int i = 1; i <=sayi ; i++) {
            if (i % 4==0){
                System.err.print(i + "-");
            }

        }
    }
}
