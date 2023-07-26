package day04_DataCasting_wrapperClass;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(3)); //a

        int sayi = 20;

        /*
            Java primitive data turleri icin hazir metod olusturamaz
            ANCAK
            primitive data turleri icin de hazir metho'lar kullanabilecek
            Wrapper class'lar olusturmustur

            int ==> Integer
            char ==> Character

            short ==> Short
            double ==> Double ...

            Wrapper Class'lar primitive data turleri ile hic problemsiz atama yapılabilir.
         */

        int sayi2 = 5;

        Integer sayi3 = sayi2;
        int sayi4 = sayi3;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);



        // Short sayi5 = (Short)sayi3; Wrapper Class'lar arasinda casting olmaz

        System.out.println(Short.MIN_VALUE); //-32768

        // Icinde sadece sayisal ifadeler bulunan bir String verildiginde
        // Matematiksel islem yapmaniz gerektiginde
        // Integer.parseInt() ile int'a cevirebiliriz


        String str1 = "22";
        String str2 = "23";

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 45



        char ch1 = ' ';

        System.out.println(Character.isDigit(ch1));  //true
        System.out.println(Character.isLetter(ch1)); //false
        System.out.println(Character.isWhitespace(ch1)); //false















    }
}
