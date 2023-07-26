package EXERCİSE;

public class C03_exercise_3 {

    public static void main(String[] args) {


        String str = "Java Candir";

        //// 6.indexdeki harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(6));

        // str'in ilk harfini yazdirin
        System.out.println(str.charAt(0));

        // str'i tum harfleri buyuk olacak sekilde yazdirin
        System.out.println(str.toUpperCase());

        // str'i tamamen kucuk harflerden olusan bir metne cevirin
        str = str.toLowerCase();

        System.out.println(str);

        String str1 = "Java ogrenmek cok eglenceli";
        String str2 = "java candir";
        String str3 = "java Ogrenmek Cok Eglenceli";
        String str4 = "Ahmet";
        String str5 = "AHmet";

        System.out.println(str.equals(str1));

        System.out.println(str.equals(str1.toLowerCase())); //false
        System.out.println(str.equals(str2.toLowerCase()));  //true
        System.out.println(str1.equalsIgnoreCase(str3.toUpperCase()));
        System.out.println(str4.equalsIgnoreCase(str5.toUpperCase()));



    }
}
