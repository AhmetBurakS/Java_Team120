package day19_Scope;

public class C02_ClassLevelVeriablelar {

    static boolean bls;
    boolean bli;


    static String strs = "Java";
    String stri;


    static int sayis;
    int sayii = 23;


    static char chrs = 'a';
    char chri;



    public static void main(String[] args) {

        System.out.println(bls);    // false
        System.out.println(strs);   // Java
        System.out.println(sayis);  // 0
        System.out.println(chrs);   // a

        C02_ClassLevelVeriablelar obj = new C02_ClassLevelVeriablelar();
        System.out.println(obj.bli);    // false
        System.out.println(obj.stri);   // null
        System.out.println(obj.sayii);  // 23
        System.out.println(obj.chri);   // ''


    }

    /*
            Class Level Kurallar
            1- class level veriable'lara deger atanmasa da
               hem olusturulabilir hem de kullanilabilir
               deger atamasi yapmadiysak, java onlara default olan degerleri atar
               boolean ==> false
               sayisal veriabler ==> 0
               non-primitive variable'lar ==> null
               char ==> ' ' char olarak hiclik
     */
}
