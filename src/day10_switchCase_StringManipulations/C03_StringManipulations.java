package day10_switchCase_StringManipulations;

public class C03_StringManipulations {

    public static void main(String[] args) {


        /*
            String manipulation, verilen bir string uzerinde HAZIR METHOD'LAR kullanarak
            degisiklik yapmak
            veya verilen string uzerindeki bir bilgiyi almak icin yaptıgımız tum islemlerdir.

            String uzerinde yapılan manipulation islemleri
            stringi kalici olarak degistirmez
         */

        String str = "Java Candir";

        // str'in ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J


        // str'i tum harfleri buyuk olacak sekilde yazdirin
        System.out.println(str.toUpperCase());  // JAVA CANDIR


        System.out.println(str);  // Java Candir

        // str'i tamamen kucuk harflerden olusan bir metne cevirin

        str = str.toLowerCase();

        System.out.println(str);



    }
}
