package day11_StringManipulations;

public class C04_Contains {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        // str Java iceriyor mu?
        System.out.println(str.contains("Java"));  // true

        // str java icerir mi
        System.out.println(str.contains("java"));  // false

        // str a icerir mi?
        System.out.println(str.contains("a"));  // true

        // *** contains method'u aranan metnin sayisiyla ilgilenmez
        // sadece var veya yok sonucu dondurur







    }
}
