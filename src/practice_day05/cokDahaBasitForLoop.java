package practice_day05;

import java.util.Scanner;

public class cokDahaBasitForLoop {

            /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

    public static void main(String[] args) {

        Scanner wise = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int basDeger = wise.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitDeger = wise.nextInt();

        int toplam = 0;

        if (basDeger>bitDeger){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");

        }else{
            for (int i = basDeger; i <=bitDeger ; i++) {

                toplam += i;

            }
            System.out.println("Girilen degerler arasidaki sayilarin toplami: "+toplam);
        }



    }
}
