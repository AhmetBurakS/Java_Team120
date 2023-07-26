package day10_switchCase_StringManipulations;

import java.util.Locale;

public class C04_toUpperCase_toLowerCase {

    public static void main(String[] args) {


        String str = "Java Candır";

        System.out.println(str.toUpperCase());  // JAVA CANDIR


        str = str.toUpperCase();    // JAVA CANDIR


        System.out.println(str.toLowerCase());  // java candir


        // eger yerel


        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));


    }
}
