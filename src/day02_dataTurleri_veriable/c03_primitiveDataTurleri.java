package day02_dataTurleri_veriable;

public class c03_primitiveDataTurleri {

    public static void main(String[] args) {


        // 1- boolean: mantıksal değerler alan true ve false kabul eder
        boolean bl1= true;
        boolean bl2= false;


        //char '' içinde yazılır ve sadece 1 karakter kabul eder
        char ch1= 'a';
        char ch2= '2';
        char ch3= '/';
        char ch4= ' ';

        //tamsayı kabul eden veriable türleri
        // 3- byte 4-short 5-int 6-long

        //türkiyede şehir nüfuslarını tutmak istiyoruz
        // data türü aynı olan veriableların değerleri ne olursa olsun
        // hafızada kapladıkları alan aynıdır
        int nufus= 2834250;
        int nufusBilecik= 30000;

        //bir şehirdeki noter sayısını tutacağız
        short notersayisiIstanbul= 456;


        float fl1= 20f;
        float fl2= 6f;
        float fl3= fl1/fl2;

        System.out.println(fl3); //3.3333333

        double db1=20;
        double db2=6;
        double db3= db1/db2;

        System.out.println(db3);

        //double bölme işlemlerinde 0,000000000000001 gibi bir hata yapabilir
        //20/5 = 3,999999999999999999

        String str = "Hello World";

        System.out.println(str);

        System.out.println("true veya false");

        System.out.println("str");  //str

        //verilen iki sayıyı çarpıp sonucu yazdırın

        int sayi1= 10;
        int sayi2= 20;

        System.out.println("verilen iki sayının çarpımı: "+ sayi1*sayi2);



    }
}
