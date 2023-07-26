package day12_stringManipulation;

public class C04_nullPointer {

    public static void main(String[] args) {


        String str1;


        // System.out.println(str1);
        //str1.concat("candir");


        str1 = "Java";

        System.out.println(str1);  // Java
        System.out.println(str1.concat("candir"));  // Java candir

        /*
            null bir deger degil pointer(isaretleyici)

            29.satir icin
            str2'nin degeri null veya str2'ye null degeri atanmis ifadeleri yanlistir

            dogru olan ifade
            str2'ye deger atamadik, bunun farkindayiz ve null olarak isaretlenmistir
         */
        String str2 = null;
        System.out.println(str2); //
        System.out.println(str2 + "candir"); // null candir

        //System.out.println(str2.concat("candir"));  // NullPointerException

        str2 = "tava";

        System.out.println(str2);  // tava
        System.out.println(str2.concat(" candir"));

        String str3 = null;
        String str4 = "";

        System.out.println(str4.isBlank());  // true    "" veya space lerden mi olusuyor
        System.out.println(str4.isEmpty());  // true

        //System.out.println(str3.isBlank());  //NullPointerException
        //System.out.println(str3.isEmpty());  //NullPointerException








    }
}
