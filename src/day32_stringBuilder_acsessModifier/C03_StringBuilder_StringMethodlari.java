package day32_stringBuilder_acsessModifier;

public class C03_StringBuilder_StringMethodlari {

    public static void main(String[] args) {

        String str = "Java Candir";

        StringBuilder sb1 = new StringBuilder();
        // sb1 = str;
        // Non-primitive data turlerinde farkli data turleri arasinda atama yapabilmek icin
        // bu iki non-primitive arasinda Prent-Child iliskisi olmalidir.

        sb1 = new StringBuilder(str);

        System.out.println(sb1); // Java Candir

        System.out.println(sb1.substring(0, 4)); // Java

        System.out.println(sb1); // Java Candir

        //sb1 J harfi iceriyor mu?

        System.out.println(sb1.toString().contains("J")); // true
        // String builder'da olmayip, String'de olan methodlari kullanmak istersek
        // StringBuilder.toString() ile String'e gecis yapabiliriz
        // bu durumda calisan methodlarin sb'i kalici olarak degistirmeyeceklerini UNUTMAMALİYİZ.
    }
}
