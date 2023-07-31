package sample_questions;

import java.util.Arrays;
import java.util.Scanner;

public class soru36 {

    public static void main(String[] args) {

        /*
            Soru 36-)
        Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output:         4
        İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
        Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
                 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen array'in uzunlugunu tek haneli olacak sekilde giriniz");

        int uzunluk = scanner.nextInt();

        int[] arr = new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            scanner = new Scanner(System.in);
            System.out.println("Array icin element giriniz");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array'in ortasindaki eleman: "+ortaIndexiBul(arr));


    }
    public static int ortaIndexiBul(int[]arr){

        int ortaIndex = arr.length/2;

        return arr[ortaIndex];

    }
}
