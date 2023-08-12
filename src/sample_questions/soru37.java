package sample_questions;

import java.util.*;

public class soru37 {

    public static void main(String[] args) {

        /*
            Soru 37-)
        SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
        (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values
        in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
        On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
        ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen art arda 10 tane tamsayi giriniz");

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {

            arr[i] = scan.nextInt();
        }

        System.out.println("Birbirinden farkli girilen sayilar: ");
        eliminateDuplicates(arr);
    }

    private static void eliminateDuplicates(int[]arr) {

            List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println(tekrarsizList);
    }

}
