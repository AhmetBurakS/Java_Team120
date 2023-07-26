package day11_StringManipulations;

public class C03_substring {

    public static void main(String[] args) {

        String str = "Java Candir";

        /*
            substring() bize verilen bir stringin istenen parcasini alma imkani tanir.

            2 turlu kullanimi vardir

            1- baslangic indeksini verirseniz, o indeksten sona kadar olan kismi verir
            2- baslangic ve bitis indekslerini verirseniz baslangıc index'inden (dahil) baslar
               bitis index'ine kadar(haric) oradaki karakterleri yazdirir
         */

        System.out.println(str.substring(3));  // a Candir

        System.out.println(str.substring(7));  // ndir

        System.out.println(str.substring(0));  // Java Candir

        System.out.println(str.substring(11));  //hiclik yazdirir

        System.out.println(str.substring(3,6));  // a C

        System.out.println(str.substring(5,10));  // Candi

        System.out.println(str.substring(1,2));  // a

        System.out.println(str.substring(6,7));  // a

        //bu yazim bize istenen index'deki tek bir elementi verir
        // charAt()'a benzer ama arti bir ozelligi var
        // subsstring bize String verdigi icin manipulation yapmaya devam edebiliriz

        //System.out.println(str.substring(15)); StringIndexOutOfBoundsException


        // 6.indexdeki harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3));  //

        //System.out.println(str.substring(8,5));  // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()-3));  // dir



        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";

        System.out.println(str1+str2+str3);             //Java Candir
        System.out.println(str1.concat(str2).concat(str3));     //Java Candir






    }
}
