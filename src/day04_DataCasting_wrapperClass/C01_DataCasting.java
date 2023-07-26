package day04_DataCasting_wrapperClass;

public class C01_DataCasting {

    public static void main(String[] args) {


        /*
            char, boolean ve stringi diger data turlerine cast edemeyiz.

            sayisal data iceren primitive data turlerini
            birbirine cast edebiliriz.

            1- daha kucuk data turundeki degeri, daha genis data turundeki veriable'a atama yaparsak
               Java Auto Widening yapar.
               yani otomatik olarak yapar.
            2- daha genis kapsamli data turundeki degeri, daha dar kapsamli veriable'a atama yaparsak
               Java bunu otomatik olaarak yapmaz. biz sorumlulugu uzerimize alarak bu castingi yaptirabiliriz.

               sorumlulugu almak icin degerin onune parantez acip
               parantez icine cast etmek istedigimiz data turunu yazabiliriz.

               Daraltma (Explicit Narrowing) yapildiginda data kayiplari olabilecegi gibi,
               data baskalasabilir.
         */






        String str = "Java Candir";

        //int sayi1 = (int)str;
        // char chr1 = (char)str;
        // boolean bl1 = str;

        String s1 = str;

        //boolean bl2 = 10;
        //boolean bl2 = 's';

        int sayi2 = 'k';
        double dbl1 = sayi2;
        //String str2 = sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1 = 7;


        sayi3 = (int)dbl2;
        sayi3 = sh1;
        sayi3 = by1;

        dbl2 = sayi3;
        dbl2 = sh1;
        dbl2 = by1;


        by1 = (byte)dbl2;
        by1 = (byte)sh1;
        by1 = (byte)sayi3;

        sh1 = (short)dbl2;
        sh1 = (short)sayi3;
        sh1 = by1;
















    }
}
