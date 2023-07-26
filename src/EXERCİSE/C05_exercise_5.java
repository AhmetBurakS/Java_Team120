package EXERCİSE;

import java.util.Scanner;

public class C05_exercise_5 {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilari alin
        // girilen sayilarin toplami 500'u gecerse
        // bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
        // girilen sayi adedi 10 veya daha yuksek olursa
        // 10'san fazla giremezsin, girilen sayilarin toplami .... oldu yazdirin
        // ve islemi bitirin

        //Scanner scanner;
        //int sayac = 0;
        //int toplam = 0;
        //int sayi;
//
        //while (sayac <= 10 && toplam < 500 ){
//
        //    scanner = new Scanner(System.in);
        //    System.out.println("Lutfen toplanmak uzere sayi girin");
        //    sayi = scanner.nextInt();
//
        //    toplam += sayi;
        //    sayac++;
        //}
//
        //if (sayac >= 10 ){
        //    System.out.println("10'dan fazla giremezsin, girilen sayilarin toplami"+toplam+"  oldu");
        //}
//
        //if (toplam>500){
        //    System.out.println("bu kadar sayi yeter, girilen sayilarin toplami"+toplam+ "oldu ");
        //}


        /*System.out.println(metniTerseCevir("Bu is bu kadar"));

    }

    public static String metniTerseCevir(String metin){

        String tersMetin = "";
        int index = metin.length()-1;

        while (index>=0){

            tersMetin += metin.charAt(index);
            index--;

        }

        return tersMetin;

         */

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Lutfen rakamlar toplamini bulmak istediginiz sayiyi girin");
        //int girilenSayi = scanner.nextInt();
//
        //int sayi = girilenSayi;
        //int birlerBasamagi = 0;
        //int rakamlarToplami = 0;
//
        //while (sayi>0){
//
        //    birlerBasamagi = sayi%10;
        //    rakamlarToplami += birlerBasamagi;
        //    sayi /= 10;
//
        //}
//
//
        //System.out.println("Girilen " +girilenSayi+ " sayisinin rakamlar toplami : "+rakamlarToplami);

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        // yazdiran bir method olusturun.


        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ussunu hesaplamak icin pozitif bir sayi girin");
        double sayi = scanner.nextDouble();

        System.out.println("Lutfen hesaplanacak us icin pozitif bir sayi girin");
        int us = scanner.nextInt();

        usHesaplama(sayi,us);

    }

    public static void usHesaplama(double sayi, int us){

        double sonuc = 1;

        while(us>0){

            sonuc *= sayi;
            us--;

        }

        System.out.println("sonuc : "+sonuc);

         */

        /*
            Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
Ipuclari:
* r=7;
* Pi=3.14
* Dairenin Cevresi : 2*Pi*r
* Dairenin Alani : Pi*r*r
         */


        //Scanner scan = new Scanner(System.in);
        //System.out.println("Lutfen dairenin yaricapini giriniz");
        //double yaricap = scan.nextDouble();
        //double pi = 3.14;
//
        //System.out.println("Dairenin cevresi : "+(2 * pi *yaricap));
        //System.out.println("Dairenin Alani : "+(3.14 * yaricap*yaricap));

        /*Soru-2)   SOUT/SYSO
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar

         */

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Lutfen dikdortgenin uzun kenarini girin");
        //double uzunKenar = scan.nextDouble();
        //System.out.println("Lutfen dikdortgenin kisa kenarini girin");
        //double kisaKenar = scan.nextDouble();
//
        //System.out.println("Dikdortgenin cevresi : "+ 2*(uzunKenar+kisaKenar));
        //System.out.println("Dikdortgenin alani : "+uzunKenar*kisaKenar);








    }

}
