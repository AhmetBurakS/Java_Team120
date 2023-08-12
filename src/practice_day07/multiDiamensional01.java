package practice_day07;

public class multiDiamensional01 {

    /*Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
    bir program yapmanız gerekmektedir. Her öğrenci için
    iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
    kullanmanız gerekmektedir. öğrencilere ait notları ve dönem ortalamasını hesaplayan
    Java programını yazınız:

     */

    //MultiDimensional Array: Ic ıce array arr= {{5.sinif ogrencileri}, {6.sinif ogrencileri}};

    public static void main(String[] args) {

        //sınav notlari icin her bir ogrenci icin her bir donem notunu ekleyecegimiz
        //ic ice 2'li array olusturalim

        int [][] sinavNotlari = {
                {80,100}, //Birinci ogrencinin donem notlari
                {75,90}, // ikinci ogrencinin donem notlari
                {100,100}, //ucuncu ogrencinin donem notlari
                {60,60},   //dorduncu ogrencinin donem notlari
                {30,90}  // besinci ogrencinin donem notlari
        };
        for (int i = 0; i < sinavNotlari.length; i++) {

            int ilkDonemNotu = sinavNotlari[i][0];
            int ikinciDonemNotu = sinavNotlari[i][1];
            System.out.println((i+1)+" Ogrencinin notlari");
            System.out.println("Birinci Donem Notu: "+ilkDonemNotu);
            System.out.println("Ikıncı Donem Notu: "+ikinciDonemNotu);

            double yilSonuNotu= (ikinciDonemNotu+ilkDonemNotu)/2.0;
            System.out.println("Yil sonu ortalamasi: "+yilSonuNotu);
            System.out.println("---------------------------------");

        }
    }
}
