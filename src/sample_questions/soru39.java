package sample_questions;

import java.util.Arrays;

public class soru39 {

    public static void main(String[] args) {

        /*
            Soru-39)
        Bir diziyi (Array) parametre olarak kabul eden ve
        dizideki tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
        Örn:
        girdi : {1,2,3,4,5,6,7,8}
        çıkış: 36
        ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
         */

        int[] arr =  {1,2,3,4,5,6,7,8};

        System.out.println("Dizideki tum elemanlarin toplami: "+toplamDondurenArray(arr));

    }
    public static int toplamDondurenArray(int[]arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam +=arr[i];
        }
        return toplam;
    }
}
