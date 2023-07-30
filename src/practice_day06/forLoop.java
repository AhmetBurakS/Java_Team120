package practice_day06;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {
//
    //    //SORU -1:
    //    // Çarpım tablosunu ekrana yazdıran bir program yazın (örneğin 1x1'den 10x10'a kadar).
//
    //    for (int i = 1; i <= 10; i++) {
    //        for (int j = 1; j <=10 ; j++) {
    //            System.out.println(i+"x"+j+"="+(i*j)+"\t");
    //        }
    //    }
    //
    //
           /*
        Soru 2:
        Kullanıcıdan bir sayı girişi alın ve 1'den o sayıya kadar olan tek sayıları ekrana yazdırın.
             */

        Scanner scan= new Scanner(System.in);
        //System.out.println("Lutfen bir tansayi giriniz");
        //int n = scan.nextInt();
//
        //for (int i = 1; i <n ; i++) {
//
        //    if (i % 2== 1){
        //        System.out.print(i+ " ");
        //    }
        //}


        /*
            Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
            dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
            baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
            */

        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangicDegeri= scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitisDegeri = scan.nextInt();

        int toplam = 0;

        if (bitisDegeri<baslangicDegeri){
            System.out.println("Btiis degeri baslangic degerinden kucuk olamaz");


            }else{
            for (int i = baslangicDegeri; i <=bitisDegeri ; i++) {

                toplam += i;

            }
            System.out.println("Baslagictan bitise sayilarin toplami: "+toplam);

        }



    }
}
