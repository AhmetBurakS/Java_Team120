package day07_ifStatements;

public class C02_BagimsizifCumleleri {

    public static void main(String[] args) {

        /*   dikkat edilecekler
            1- eğer boolean sarttan sonra {} kullanilmazsa
               Java if body'si olarak ilk ; e kadar olan bolumu alir
               digerleri if body'sinin disinda kalir.

            2- if cumlesinde {} kullnamaz ve boolean sartin sonuna ; yazarsaniz if cumlesi hcbir islem yapmaz
            cunku body'si yoktur.

            OZETLE
            if body'si tek satirdan olusuyorsa suslu parantez kullanmasaniz da olur
            ancak if body'si birden fazla satirdan olusuyorsa MUTLAKA suslu parantez kullanmalisiniz.
         */

        int a= 35;
        int b= 30;

        if (a<b) {
            System.out.println("a 'b'den kucuk 1");
            System.out.println("a 'b'den kucuk 2");
            System.out.println("a 'b'den kucuk 3");
        }

        if (a % 2 == 0)
            System.out.println("a 2 ile tam bolunuyor 1"); // ilk virgule kadar olan kisim if body sidir
            System.out.println("a 2 ile tam bolunuyor 2");  // sonraki satirlarin if ile alakasi yoktur
            System.out.println("a 2 ile tam bolunuyor 3");



    }
}
