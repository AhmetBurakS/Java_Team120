package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop01 {

            // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
        // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın.
        // for each loop kullaniniz

        // Örnek çıktı:
        // Meyveler: ELMA ARMUT ÇİLEK

    public static void main(String[] args) {

      Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz 3 adet meyve ismini giriniz");
        String meyve1 = scan.next();
        String meyve2 = scan.next();
        String meyve3 = scan.next();


        ArrayList<String> meyveList = new ArrayList<>();
        meyveList.add(meyve1);
        meyveList.add(meyve2);
        meyveList.add(meyve3);


        ArrayList<String> buyukHarfliMeyveList = new ArrayList<>();
        for (String each: meyveList) {

            buyukHarfliMeyveList.add(each.toUpperCase());
        }
        System.out.println(buyukHarfliMeyveList);


    }
}
