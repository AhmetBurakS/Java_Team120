package day06_concatination_matematiksel_operatorler;

public class C01_Concatenation {

    public static void main(String[] args) {


        String s1 = "Java";
        String s2=  "Candir";
        String s3= " ";
        String s4= "";
        int a = 3;
        int b = 5;

        //sadece yukaridaki veriable'lari kullanarak
        // asagida verilen metni yazdirin

        // Java35
        System.out.println(s1+a+b); // Java35

        // Java15
        System.out.println(s1+ a*b ) ; // Java15

        // 8Candir
        System.out.println(a+b+s2);  // 8Candir

        // 53Java

        System.out.println(  b+(a+s1)  );  // 53Java
        System.out.println( s4+ b + a + s1 ); // 53Java
        System.out.println(b + s4 + a + s1); // 53Java


        // 35 Java

        System.out.println( s4 + a + b + s3 + s1);  // 35 Java










    }
}
