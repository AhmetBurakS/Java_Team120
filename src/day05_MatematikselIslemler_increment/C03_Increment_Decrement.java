package day05_MatematikselIslemler_increment;

public class C03_Increment_Decrement {

    public static void main(String[] args) {

        int sayi = 10;

        // sayi veriable'nin degerini 2 katinin 5 fazlasi yapin


        sayi = 2 * sayi + 5;

        System.out.println(sayi);

        // 2.yontemle yaparsak

        sayi = 10;
        sayi *=2 ;
        sayi +=5 ;

        System.out.println(sayi);


        sayi = 10;

        sayi *= 3;

        sayi -= 3;

        sayi /= 3;

        System.out.println(sayi);


        int a = 10;

        //a nin degerini yeni olusturdugumuz b'ye atayip sonra a'nin degerini bir artirin
        //a ve b yi yazdirin

        int b = a;
        a ++;

        System.out.println("a : " + a + " b : " + b);


        // a'nin degerini bir artirin, sonra a'nin degerini b'ye atayin.

        a ++;

        b = a;


        System.out.println("a : " + a + " b : " + b);





    }
}
